// public class ComparablePassangerPlane extends PassangerPlane implements Comparable<ComparablePassangerPlane>{
    
//     public ComparablePassangerPlane(int id) {
//         super(id, id);
//     }


//     @Override
//     public int getID() {
//         return id;
//     }

//     @Override
//     public String status() {
//         if (landed) {
//             return "Passanger plane " + id + " on the ground";
//         }

//         else {
//             return "Passanger plane " + id + " has took off";
//         }
//     }


//     @Override
//     public int compareTo(object o) {
//         if (getPassanger() > o.getPassanger()) {
//             return 1;
//         }
//         else if (getPassanger() < o.getPassanger()) {
//             return -1;
//         }
//         else {
//             return 0;
//         }
//     }
// }