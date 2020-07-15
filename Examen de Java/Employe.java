

public class Employe  extends IEmploye{

         //Attributs Instances
            private  id;
            private  nomComplet;
            private dateEmbauche ;

         //Attributs Classes ou Static

            private static String affiche;
            private static String compare;
            private static String anciennete;


             //proprietes Employe 

       //proprietes Navigationnelles=>
       //Association ManyToOne entre Employe  et Service


          //Methodes Instances Concretes 

           //Getters
              public  getId(){
                  return this.id;
       }

       //Setters
              public String setId(id){
                 this.id=id;
      }


         //Getters
              public  getNomComplet(){
                  return this.nomComplet;
       }

       //Setters
              public String setNomComplet(nom){
                 this.nom=nomComplet;
      }


       //Getters
              public  getDateEmbauche(){
                  return this.dateEmbauche;
       }

       //Setters
              public String setDateEmbauche(dateEmbauche){
                 this.dateEmbauche=dateEmbauche;
      }



           //Methodes Static Concretes 
      
         //Getters
              public static String getAffiche(){
                 return IEmploye.affiche;
             }

         //Setters
            public static void setAffiche(String affiche){
                IEmploye.affiche = affiche;
        }

         
      
         //Getters
              public static String getCompare(){
                 return  IEmploye.compare;
             }

         //Setters
            public static void setCompare(String compare){
                 IEmploye.compare = compare;
        }


         //Getters
              public static String getAnciennete(){
                 return  IEmploye.anciennete;
             }

         //Setters
            public static void setAaciennete(String anciennete){
                 IEmploye.anciennete = anciennete;
        }


         

     



       
  }
   