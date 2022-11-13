/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package lk.buildcostaffapplication.view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import lk.buildcostaffapplication.reports.Expenses;
import lk.buildcostaffapplication.reports.Sales;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.swing.JRViewer;
/**
 *
 * @author Binath Perera
 */

public class ReportsPanel extends javax.swing.JPanel {

    /**
     * Creates new form ReportPanel
     */
    public ReportsPanel() {
        initComponents();
        loadSalesReport();
        loadExpensesReport();
        loadGrowthReport();
    }
    
    public void loadSalesReport(){
        List<Sales> arr=new ArrayList<Sales>();
        arr.add(new Sales(3432,"January"));
        arr.add(new Sales(343,"February"));
        arr.add(new Sales(4323,"March"));
        arr.add(new Sales(900,"April"));
        arr.add(new Sales(100,"May"));
        arr.add(new Sales(3623,"June"));
        arr.add(new Sales(3245,"July"));
        arr.add(new Sales(2343,"August"));
        
        JRBeanCollectionDataSource jrbeansource=new JRBeanCollectionDataSource(arr);
        HashMap<String ,Object> parameters=new HashMap<String,Object>();
        parameters.put("salesParameter",jrbeansource);
        try {
            JasperReport jasperReport= (JasperReport) JRLoader.loadObject(getClass().getResource("/salesReport.jasper"));
            JasperPrint jp= JasperFillManager.fillReport(jasperReport, parameters, new JREmptyDataSource());
            JRViewer v=new JRViewer(jp);
            salesRevenuePanel.add(v);
        } catch (JRException ex) {
            Logger.getLogger(ReportsPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void loadExpensesReport(){
        List<Expenses> arr=new ArrayList<Expenses>();
        arr.add(new Expenses(3432,"Rent"));
        arr.add(new Expenses(343,"Other"));
        arr.add(new Expenses(4323,"Insurance"));
        arr.add(new Expenses(900,"Bank"));
        
        JRBeanCollectionDataSource jrbeansource=new JRBeanCollectionDataSource(arr);
        HashMap<String ,Object> parameters=new HashMap<String,Object>();
        parameters.put("expensesParam",jrbeansource);
        try {
            JasperReport jasperReport= (JasperReport) JRLoader.loadObject(getClass().getResource("/expenses.jasper"));
            JasperPrint jp= JasperFillManager.fillReport(jasperReport, parameters, new JREmptyDataSource());
            JRViewer v=new JRViewer(jp);
            expensesPanel.add(v);
        } catch (JRException ex) {
            Logger.getLogger(ReportsPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void loadGrowthReport(){
        List<Sales> arr=new ArrayList<Sales>();
        arr.add(new Sales(10,"January"));
        arr.add(new Sales(343,"February"));
        arr.add(new Sales(4322,"March"));
        arr.add(new Sales(12321,"April"));
        arr.add(new Sales(12323,"May"));
        arr.add(new Sales(21435,"June"));
        arr.add(new Sales(31234,"July"));
        arr.add(new Sales(42344,"August"));
        JRBeanCollectionDataSource jrbeansource=new JRBeanCollectionDataSource(arr);
        HashMap<String ,Object> parameters=new HashMap<String,Object>();
        parameters.put("salesParameter",jrbeansource);
        try {
            JasperReport jasperReport= (JasperReport) JRLoader.loadObject(getClass().getResource("/valuationReport.jasper"));
            JasperPrint jp= JasperFillManager.fillReport(jasperReport, parameters, new JREmptyDataSource());
            JRViewer v=new JRViewer(jp);
            growthPanel.add(v);
        } catch (JRException ex) {
            Logger.getLogger(ReportsPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        salesRevenuePanel = new javax.swing.JPanel();
        expensesPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        growthPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();

        jLabel1.setText("Total employees");

        jLabel2.setText("Employees clocked in");

        salesRevenuePanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Sales revenue"));
        salesRevenuePanel.setLayout(new java.awt.BorderLayout());

        expensesPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Expenses"));
        expensesPanel.setLayout(new java.awt.BorderLayout());

        jLabel3.setText("Net asset value(LKR)");

        growthPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Company Valuation"));
        growthPanel.setLayout(new java.awt.BorderLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Goals"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel4.setText("Liabilities");

        jButton1.setText("Remove");

        jButton2.setText("Add");

        jLabel5.setText("Year");

        jButton3.setText("Get reports for this year");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(264, 264, 264)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
                            .addComponent(jTextField4)))
                    .addComponent(growthPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTextField5)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(salesRevenuePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(expensesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jButton3)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(salesRevenuePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
                    .addComponent(expensesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(growthPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel expensesPanel;
    private javax.swing.JPanel growthPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JPanel salesRevenuePanel;
    // End of variables declaration//GEN-END:variables
}
