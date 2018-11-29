package tg.esiba.gestion_bibliotheque.reports;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Yves
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanArrayDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
import tg.esiba.iua.bibliotheque.entites.Livre;

/**
 * Classe de generation des etats liés aux Livres
 *
 * @author Yves
 */
public class LivresReport {

//   Variable globale contenant la liste des Livres a imprimer
    List<Livre> le = new ArrayList<>();

    //Titre de l'etat -OPTIONNEL-
    String titreEtat = null;

    public LivresReport() {
    }

    public LivresReport(List<Livre> le) {
        this.le = le;
    }

    public LivresReport(List<Livre> le, String titreEtat) {
        this.le = le;
        this.titreEtat = titreEtat;
    }

    /**
     * Methode generant l'etet LISTE DES ETUDIANTS
     */
    public void displayReportListLivre() {
        //Conversion de la liste d'Livre "le" en dataSource pour jasperreport
        JRBeanArrayDataSource dataSource;
        Livre[] reportRows = new Livre[le.size()];
        int i = -1;
        for (Livre p : le) {
            reportRows[++i] = p;
        }
        dataSource = new JRBeanArrayDataSource(reportRows);

        //compilation et generation de l'etat
        JasperPrint jasperPrint = null;
        try {
            JasperDesign jasperDesign = JRXmlLoader.load(getClass().getResourceAsStream("tg/esiba/gestion_bibliotheque/reports/jrxml/list-livres-report.jrxml"));
            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
            jasperPrint = JasperFillManager.fillReport(jasperReport, new HashMap(), dataSource);

        } catch (JRException e) {
            e.printStackTrace();
        }

        //Affichage de l'etat a l'ecran
        JasperViewer jasperViewer = new JasperViewer(jasperPrint);
        jasperViewer.viewReport(jasperPrint, false);
    }

}
