/*
PROGRAMA DE MOVIMIENTOS DE LAS FICHAS DEL AJEDREZ DEPENDIENDO DE LA ELECCIÓN DEL USUARIO.
Realizado por: Christian Javier Ruiz Marin y Daniel Stalin Gualán Lozano
Curso: Software, primer ciclo "A".
Fecha de Entrega: Lunes, 15 de julio del 2024.
*/

package Vista; //carpeta creada para recopilar el jFrame y manipular la vista del programa
import java.awt.Color; //Clase usada para representar los colores tanto del tablero como de los posibles movimientos de las fichas
import java.awt.Dimension; //Clase usada para establecer la dimension de los botones que conforman la matriz del tablero
import java.awt.Toolkit; //Clase para acceder a las propiedades del SO y adecuar la interfaz del programa dependiendo de la pantalla del usuario
import javax.swing.ImageIcon; //Clase usada para mostrar las imagenes de cada una de las fichas en pantalla dentro de la matriz
import javax.swing.JButton; //Clase usada para crear la matriz de botones del tablero
import javax.swing.JOptionPane; //Clase usada para mostrar los distintos mensajes de error que se pueden dar en la ejecución del programa

public class vistaTablero extends javax.swing.JFrame { //Inicio del jFrame (Vista del tablero y opciones)
        private JButton[][] jButtonMatrix = new JButton[8][8]; //Creación de la matriz de botons 8x8 mediante una nueva variable asignada con Grid Layout en la interfaz
    public vistaTablero() { //Inicializacion de la ventana gráfica
        initComponents(); //Configuración de los métodos usados para la ejecución
        centraVentana(); //clase usada para centrar la ventana de visualización
        for (int i=0; i<8; i++){ //Asignación de la condicional que ayudará a controlar la matriz con iterador 'i'
            for (int j=0;j<8; j++){ //Asignación de la condicional que ayudará a controlar la matriz con iterador 'j'
                jButtonMatrix[i][j] = new JButton(); //Asignar la matriz llena de botones (jButtons)
                jButtonMatrix[i][j].setPreferredSize(new Dimension(50,50)); //Establecimiento del tamaño por pixeles de cada botón de la matriz
                jPanelTablero.add(jButtonMatrix[i][j]); //Añadir botones dentro del primer jPanel, donde el mismo se visualizará
            }
        }
        for (int i=0; i<8; i++){ //iterador i de matriz
            for (int j=0; j<8;j++){ //iterador j de matriz
                JButton boton = jButtonMatrix[i][j]; //Creacion de variable para asignación de color
                if((i+j)%2==0){ //condicional para colorear las casillas, en caso de ser impar...
                    boton.setBackground(Color.WHITE); //colorear de blanco
                }else{ //en caso de ser par...
                    boton.setBackground(Color.BLACK); //colorear de negro
                }
            }
        }
    }
public void centraVentana(){ //clase creada con el objetivo de adecuar la ventana a las patallas de los usuarios
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); //Creacion y asignacion de variable para determinar las propiedades de pantalla
            Dimension frameSize = getSize(); //devolver tamaño actual de la ventana gráfica
            if(frameSize.height > screenSize.height){ //determinar si la pantalla del usuario es mas alta o mas baja que la interfaz
                frameSize.height = screenSize.height; //con el fin de asignar una mejor distribucion de tamaño personalizada
            }
            if(frameSize.width > screenSize.width){ //determinar si la pantalla del usuario es mas ancha o mas delgada que la interfaz
                frameSize.width = screenSize.width; //con el fin de asignar una mejor distribucion de tamaño personalizada
            }
            setLocation((screenSize.width - frameSize.width)/2, //calculo de la posicion horizontal de la ventana del usuario
                    (screenSize.height - frameSize.height)/2); //calculo de la posicion vertical del usuario para asignar nuevo tamaño
            //establece la posición de la ventana en la pantalla del usuario
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTablero = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jComboBoxImagen = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldFila = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldColumna = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Movimientos de Ajedrez");
        setType(java.awt.Window.Type.UTILITY);

        jPanelTablero.setLayout(new java.awt.GridLayout(8, 8));

        jPanel2.setBackground(new java.awt.Color(255, 153, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBoxImagen.setBackground(new java.awt.Color(255, 102, 102));
        jComboBoxImagen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Alfil Blanco", "Alfil Negro", "Caballo Blanco", "Caballo Negro", "Peon Blanco", "Peon Negro", "Reina Blanca", "Reina Negra", "Rey Blanco", "Rey Negro", "Torre Blanca", "Torre Negra" }));
        jComboBoxImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxImagenActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBoxImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, -1, 38));

        jLabel1.setFont(new java.awt.Font("Wide Latin", 3, 22)); // NOI18N
        jLabel1.setText("MOVIMIENTOS ");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 355, 33));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        jLabel2.setText("Fila de Inicio");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, 41));

        jTextFieldFila.setBackground(new java.awt.Color(0, 102, 51));
        jTextFieldFila.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        jTextFieldFila.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldFila.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 0, 0)));
        jTextFieldFila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFilaActionPerformed(evt);
            }
        });
        jTextFieldFila.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldFilaKeyTyped(evt);
            }
        });
        jPanel2.add(jTextFieldFila, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 40, 45));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        jLabel3.setText("Fila de Columna");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, 24));

        jTextFieldColumna.setBackground(new java.awt.Color(0, 102, 0));
        jTextFieldColumna.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        jTextFieldColumna.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldColumna.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 0, 0)));
        jTextFieldColumna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldColumnaActionPerformed(evt);
            }
        });
        jTextFieldColumna.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldColumnaKeyTyped(evt);
            }
        });
        jPanel2.add(jTextFieldColumna, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 40, 47));

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI Emoji", 3, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("INICIAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 448, 144, 44));

        jButton2.setBackground(new java.awt.Color(255, 255, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI Emoji", 3, 24)); // NOI18N
        jButton2.setText("RESETEAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 520, -1, 51));

        jLabel4.setFont(new java.awt.Font("Wide Latin", 1, 20)); // NOI18N
        jLabel4.setText("DE AJEDREZ");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 281, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        jLabel5.setText("Ficha");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pngtree-complex-tech-background-with-molecules-and-data-connection-form-design-photo-image_37390678 (2) (1).jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 620));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelTablero, javax.swing.GroupLayout.PREFERRED_SIZE, 792, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 359, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelTablero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldColumnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldColumnaActionPerformed
       
        //NO USADO
    }//GEN-LAST:event_jTextFieldColumnaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//Declaracion de lo que hará el botón "Iniciar" llamado "jButton1"  en el programa 
        if(jTextFieldFila.getText().isEmpty() || jTextFieldColumna.getText().isEmpty()){ //si una de las casillas para escribir la fila y columna de la ficha está vacia...
            JOptionPane.showMessageDialog(this, "Debe de llenar todos los campos como se pide."); //mostrar un mensaje de error en el sistema
        }else{ //si no...
         int fila = Integer.parseInt(jTextFieldFila.getText()); //variable para almacenar lo obtenido en la casilla de ingreso de Fila
         int filaMatriz = fila-1; //Contabilización de la fila de matriz del 1 al 8 
         
        int columna = Integer.parseInt(jTextFieldColumna.getText()); //variable para almacenar lo obtenido en la casilla de ingreso de Columna
        int columnaMatriz = columna - 1; //Contabilización de la columna de matriz del 1 al 8 
        String imagenSeleccionada = (String) jComboBoxImagen.getSelectedItem(); //variable para tomar lo obtenido de la casilla del ComboBox
        String rutaImagen = "/Imagenes/"+imagenSeleccionada+".png"; //Variable para poder llamar la imagen de la carpeta en la que se encuentran
        jButtonMatrix[filaMatriz][columnaMatriz].setIcon(new ImageIcon(getClass().getResource(rutaImagen))); //Asignación de la imagen en el sitio de la matriz que desee el usuario
switch (imagenSeleccionada){ //Condicional para determinar los movimientos posibles de cada una de las fichas
    case "Alfil Blanco": //si selecciona Alfil Blanco dentro del Combo Box hacer:
        Color casillaColor = jButtonMatrix[fila][columna].getBackground(); //varable para tomar el color de la casilla en donde se ubica la ficha
        if(casillaColor==Color.WHITE){ //si el color de la casilla en la que se ubica la ficha es blanco...
            for(int i=0;i<8;i++){
                for(int j=0; j<8; j++){
                    int suma = fila + columna -2;
                    int resta=fila-columna;
                    if(((i+j==suma)||(i-j==resta))&& i>=0 && i<8 && j>=0 && j<8){
                        jButtonMatrix[i][j].setBackground(Color.GREEN);
                    }
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Si usa el alfil blanco debe de seleccionar una casilla blanca");
        }
        break; //Terminar el caso del switch actual y continuar con el siguiente
    case "Alfil Negro": //Si se selecciona Alfil Negro en el Combo Box hacer
        Color casillaColorX = jButtonMatrix[fila][columna].getBackground();
        if(casillaColorX ==Color.BLACK){
            for(int i=0;i<8;i++){
                for(int j=0;j<8;j++){
                    int suma= fila+columna-2;
                    int resta=fila-columna;
                    if(((i+j==suma)||(i-j==resta))&&i>=0&&i<8&&j>=0&&j<8){
                        jButtonMatrix[i][j].setBackground(Color.GREEN);
                    }
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Si usa el alfil negro debe de seleccionar una casilla negra");
        }
        break; //Terminar el caso del switch actual y continuar con el siguiente
    case "Caballo Blanco": //Si se selecciona Caballo Blanco en el Combo Box hacer
        fila-=1; //Ajuste de posicion de fila actual restandole 1
        columna-=1;//Ajuste de posicion de columna actual restandole 1
        int[][]movimientos={ //array bidimensional para guardar los posibles movimientos
            {fila-2,columna+1},{fila-2,columna-1},{fila-1,columna+2},{fila-1,columna-2},//guardar 2 casillas arriba y 1 casilla a la derecha, 2 casillas arriba y 1 casilla a la izquierda, 1 casilla arriba y 2 casillas a la derecha, 1 casilla arriba y 2 casillas a la izquierda
                {fila+1,columna+2},{fila+1,columna-2},{fila+2,columna+1},{fila+2,columna-1} //guardar 1 casilla abajo y 2 casillas a la derecha, 1 casilla abajo y 2 casillas a la izquierda, 2 casillas abajo y 1 casilla a la derecha, 2 casillas abajo y 1 casilla a la izquierda
        };
        for(int[] movimiento: movimientos){ //iterar sobre posibles movimientos del caballo usando 'for'
            int nuevaFila = movimiento[0]; //extraer cordenadas de fila guardadas anteriormente
            int nuevaColumna = movimiento[1]; //extraer cordenadas de columna guardadas anteriormente
            if(nuevaFila>=0&&nuevaFila<8&&nuevaColumna>=0&&nuevaColumna<8){ //se verifica si las casillas dadas en el array son validas, osea que se enceuntran dentro de la matriz 8x8
                jButtonMatrix[nuevaFila][nuevaColumna].setBackground(Color.GREEN); //si se cumple la condición, las casillas de posibles movimientos se pintan de verde
            }
        }
        jButtonMatrix[fila][columna].setBackground(Color.GREEN);
        break; //Terminar el caso del switch actual y continuar con el siguiente
        case "Caballo Negro": //Si se selecciona Caballo Negro en el Combo Box hacer
        fila-=1;//Ajuste de posicion de fila actual restandole 1
        columna-=1;//Ajuste de posicion de columna actual restandole 1
        int[][]movimientosx={ //array bidimensional para guardar los posibles movimientos
            {fila-2,columna+1},{fila-2,columna-1},{fila-1,columna+2},{fila-1,columna-2}, //guardar 2 casillas arriba y 1 casilla a la derecha, 2 casillas arriba y 1 casilla a la izquierda, 1 casilla arriba y 2 casillas a la derecha, 1 casilla arriba y 2 casillas a la izquierda
                {fila+1,columna+2},{fila+1,columna-2},{fila+2,columna+1},{fila+2,columna-1} //guardar 1 casilla abajo y 2 casillas a la derecha, 1 casilla abajo y 2 casillas a la izquierda, 2 casillas abajo y 1 casilla a la derecha, 2 casillas abajo y 1 casilla a la izquierda
        };
        for(int[] movimientox: movimientosx){ //iterar sobre posibles movimientos del caballo usando 'for'
            int nuevaFila = movimientox[0]; //extraer cordenadas de fila guardadas anteriormente
            int nuevaColumna = movimientox[1];//extraer cordenadas de columna guardadas anteriormente
            if(nuevaFila>=0&&nuevaFila<8&&nuevaColumna>=0&&nuevaColumna<8){ //se verifica si las casillas dadas en el array son validas, osea que se enceuntran dentro de la matriz 8x8
                jButtonMatrix[nuevaFila][nuevaColumna].setBackground(Color.GREEN); //si se cumple la condición, las casillas de posibles movimientos se pintan de verde
            }
        }
        jButtonMatrix[fila][columna].setBackground(Color.GREEN); //si se cumple la condición, las casillas de posibles movimientos se pintan de verde
        break; //Terminar el caso del switch actual y continuar con el siguiente
            case "Peon Blanco": //Si se selecciona Peon Blanco en el Combo Box hacer
                for(int i=0;i<8;i++){
                    for(int j=0;j<8;j++){
                        if(fila==7){
                            if((j==columna-1)&&(i==filaMatriz-1||i==filaMatriz-2)){
                                jButtonMatrix[i][j].setBackground(Color.GREEN);
                            }
                        }else{
                            if((j==columna-1)&&(i==filaMatriz-1)){
                                jButtonMatrix[i][j].setBackground(Color.GREEN);
                            }
                        }
                    }
                }
                break; //Terminar el caso del switch actual y continuar con el siguiente
        case "Peon Negro": //Si se selecciona Peon Negro en el Combo Box hacer
        for(int i=0;i<8;i++){ //iterar en las filas del ajedrez del 0 al 7
            for(int j=0;j<8;j++){ //iterar en las columnas del ajedrez del 0 al 7
                if((j==columnaMatriz)&&((i==filaMatriz+1))){
                    jButtonMatrix[i][j].setBackground(Color.GREEN);
                }
                if((j==columnaMatriz)&&((i==filaMatriz+2))&&(filaMatriz==1)){
                    jButtonMatrix[i][j].setBackground(Color.GREEN);
                }
            }
        }
        break; //Terminar el caso del switch actual y continuar con el siguiente
        case "Reina Blanca": //Si se selecciona Reina Blanca en el Combo Box hacer
            for(int i=0; i<8;i++){ //iterar en las filas del ajedrez del 0 al 7
                for(int j=0; j<8; j++){ //iterar en las columnas del ajedrez del 0 al 7
                    int suma= fila+columna-2; //asignacion de diagonal de menos de 2 casillas
                    int resta = fila-columna; //diagonal secundaria 
                    if((((i+j)==suma)||((i-j)==resta))||((i==fila-1)||(j==columna-1))){ //rodear la ficha en cuestion en 1 casilla
                        jButtonMatrix[i][j].setBackground(Color.GREEN); //si se cumple la condición, las casillas de posibles movimientos se pintan de verde
                    }
                }
            }
            break; //Terminar el caso del switch actual y continuar con el siguiente
        case "Reina Negra": //Si se selecciona Reina Negra en el Combo Box hacer
           for(int i=0; i<8;i++){ //iterar en las filas del ajedrez del 0 al 7
                for(int j=0; j<8; j++){ //iterar en las columnas del ajedrez del 0 al 7
                    int suma= fila+columna-2;//asignacion de diagonal de menos de 2 casillas
                    int resta = fila-columna;//diagonal secundaria 
                    if((((i+j)==suma)||((i-j)==resta))||((i==fila-1)||(j==columna-1))){//rodear la ficha en cuestion en 1 casilla
                        jButtonMatrix[i][j].setBackground(Color.GREEN); //si se cumple la condición, las casillas de posibles movimientos se pintan de verde
                    }
                }
            }
            break;  //Terminar el caso del switch actual y continuar con el siguiente
    case "Rey Blanco": //Si se selecciona Rey Blanco en el Combo Box hacer
       for(int i=0;i<8;i++){ //iterar en las filas del ajedrez del 0 al 7
           for(int j=0;j<8;j++){ //iterar en las columnas del ajedrez del 0 al 7
               if((i==fila-2)&&((j==columna-2)||(j==columna-1)||(j==columna))|| //guardar dos movimientos hacia arriba de ser posible o 1 
                       (i==fila)&&((j==columna-2)||(j==columna-1)||(j==columna))|| //1 o 0 columnas a la izquierda, centro o derecha
                       (i==fila-1)&&((j==columna-2)||(j==columna-1)||(j==columna))){ //1 o 2 columnas a la izquierda, centrar casilla y evaluar el movimiento
                   jButtonMatrix[i][j].setBackground(Color.GREEN); //si se cumple la condición, las casillas de posibles movimientos se pintan de verde
               }
           }
       }
       break; //Terminar el caso del switch actual y continuar con el siguiente
    case "Rey Negro": //Si se selecciona Rey Negro en el Combo Box hacer
        for(int i=0;i<8;i++){ //iterar en las filas del ajedrez del 0 al 7
           for(int j=0;j<8;j++){ //iterar en las columnas del ajedrez del 0 al 7
               if((i==fila-2)&&((j==columna-2)||(j==columna-1)||(j==columna))||//guardar dos movimientos hacia arriba de ser posible o 1 
                       (i==fila)&&((j==columna-2)||(j==columna-1)||(j==columna))||//1 o 0 columnas a la izquierda, centro o derecha
                       (i==fila-1)&&((j==columna-2)||(j==columna-1)||(j==columna))){//1 o 2 columnas a la izquierda, centrar casilla y evaluar el movimiento
                   jButtonMatrix[i][j].setBackground(Color.GREEN); //si se cumple la condición, las casillas de posibles movimientos se pintan de verde
               }
           }
       }
       break; //Terminar el caso del switch actual y continuar con el siguiente
    case "Torre Blanca": //Si se selecciona Torre Blanca en el Combo Box hacer
        for(int i=0; i<8; i++){ //iterar en las filas del ajedrez del 0 al 7
            for(int j=0;j<8;j++){ //iterar en las columnas del ajedrez del 0 al 7
                if((i==fila-1)||(j==columna-1)){ //tomar las casillas que se encuentren arriba, abajo, derecha e izquierda, como una t
                    jButtonMatrix[i][j].setBackground(Color.GREEN); //si se cumple la condición, las casillas de posibles movimientos se pintan de verde
                }
            }
        }
        break; //Terminar el caso del switch actual y continuar con el siguiente
    case "Torre Negra": //Si se selecciona Torre Negra en el Combo Box hacer
        for(int i=0; i<8; i++){ //iterar en las filas del ajedrez del 0 al 7
            for(int j=0;j<8;j++){ //iterar en las columnas del ajedrez del 0 al 7
                if((i==fila-1)||(j==columna-1)){ //tomar las casillas que se encuentren arriba, abajo, derecha e izquierda, como una t
                    jButtonMatrix[i][j].setBackground(Color.GREEN); //si se cumple la condición, las casillas de posibles movimientos se pintan de verde
                }
            }
        }
        break; //Terminar el caso del switch actual y continuar con el siguiente
        default: //si se selecciona otra opción...
        JOptionPane.showMessageDialog(null, "Error, debe de ingresar una ficha", "Error",JOptionPane.ERROR_MESSAGE); //mostrar error
}
    }//GEN-LAST:event_jButton1ActionPerformed
    }
    
    private void jComboBoxImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxImagenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxImagenActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        for (int i = 0; i < 8; i++) { //iterador filas del ajedrez
        for (int j = 0; j < 8; j++) { //iterador columnas del ajedrez
            jButtonMatrix[i][j].setIcon(null); // Eliminar la imagen actual
            //Volver al color original del ajedrez
            if ((i + j) % 2 == 0) {  //si es impar...
                jButtonMatrix[i][j].setBackground(Color.WHITE);//colorear de blanco
            } else { //si no...
                jButtonMatrix[i][j].setBackground(Color.BLACK); //colorear de negro
            }
        }
    }

    // Resetear los campos de texto
    jTextFieldFila.setText(""); //resetear la parte de la fila
    jTextFieldColumna.setText(""); //resetear la parte de la columna
    jComboBoxImagen.setSelectedIndex(0); // Seleccionar la opción "Seleccionar" por defecto
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextFieldFilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFilaActionPerformed
        // TODO add your handling code here:
         
    }//GEN-LAST:event_jTextFieldFilaActionPerformed

    private void jTextFieldFilaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldFilaKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar(); //caracter para restringir los valores a ingresar en las partes de texto
        if(c<'0'||c>'9') evt.consume(); //Restricción a usar solo numeros en los textFields
    }//GEN-LAST:event_jTextFieldFilaKeyTyped

    private void jTextFieldColumnaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldColumnaKeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();//caracter para restringir los valores a ingresar en las partes de texto
        if(c<'0'||c>'9') evt.consume();//Restricción a usar solo numeros en los textFields
    }//GEN-LAST:event_jTextFieldColumnaKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(vistaTablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaTablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaTablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaTablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() { //main para mostrar el tablero
                new vistaTablero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBoxImagen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelTablero;
    private javax.swing.JTextField jTextFieldColumna;
    private javax.swing.JTextField jTextFieldFila;
    // End of variables declaration//GEN-END:variables
}
