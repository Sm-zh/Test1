package LabProject;
public class Course{
        private String prerequisite;
        private String corequisite;

        public Course(String prerequisite, String corequisite) {
            this.prerequisite = prerequisite;
            this.corequisite = corequisite;
        }

        public String getPrerequisite() {
            return prerequisite;
        }

        public String getCorequsite() {
            return corequisite;
        }

        public String toString() {
            return "Prerequisite: " + prerequisite + " Corequisite: " + corequisite;
        }
    }