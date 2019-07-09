package org.afdemp.cb8.myfirstrest.controllers;

import java.util.List;
import java.util.Locale;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class MyRestController {

	/*
	 * This method will show a rest string.
	 */
	@RequestMapping(value = { "/", "/list" }, method = RequestMethod.GET)
	public String showRest(ModelMap model) {

		model.addAttribute("reststring", "[\n" +
"  {\n" +
"    \"questions\": [\"Tι είναι το Coding Bootcamp;\",\"Ποια είναι η διαδικασία επιλογής των υποψηφίων;\",\"Υπάρχει κάποιο όριο ηλικίας για τη συμμετοχή στο πρόγραμμα;\",\"Ποιο είναι το κόστος του προγράμματος;\",\"Θα βρω εργασία ως προγραμματιστής με τη λήξη του Bootcamp;\",\"Που γίνονται τα μαθήματα;\",\"Πόσο διαρκεί το πρόγραμμα μαθημάτων;\",\"Ποιος θα κάτσει στον Σιδερένιο Θρόνο στο Game of Thrones;\",\"Ποια τραγουδίστρια θα παρουσιάσει το 7 Rings στα Billboard Music Awards 2019;\",\"Ποιος από τους παρακάτω οδηγούς θα κερδίσει το Ισπανικό Grand Prix της F1 στην Ισπανία;\"]\n" +
"      \n" +
"  },\n" +
"  {\n" +
"    \"answers\": \n" +
"      {\n" +
"        \"1\": [\"Μια σχολή πολεμικών τεχνών για προγραμματιστές\",\"Ένα ιδιαίτερα εντατικό πρόγραμμα το οποίο παρέχει ταχύρρυθμη εκπαίδευση και πιστοποίηση στον τομέα του προγραμματισμού\",\"Δεν ξέρω\",\"Ήρθα για να μάθω\"],\n" +
"        \"2\": [\"Να είσαι παθιασμένος με τον Προγραμματισμό\",\"Να είσαι προετοιμασμένος να εργαστείς σκληρά καθώς το πρόγραμμα είναι πολύ απαιτητικό\",\"Να γνωρίζεις καλά Αγγλικά (Επίπεδο Β2)\",\"Όλα τα παραπάνω\"],\n" +
"        \"3\": [\"Ναι, από βρέφος έως 175 ετών\",\"Όχι δεν υπάρχει\",\"Ίσως αλλά δεν μου το λένε\",\"Κανένα από τα παραπάνω\"],\n" +
"        \"4\": [\"’κουσα ότι θα με πληρώσουν 2500 ευρώ για να παρακολουθήσω\",\"Ίσως πρέπει να πληρώσω κάποια συνδρομή, 5 ευρώ το μήνα\",\"Νομίζω κοστίζει 200 το μήνα\",\"Το κόστος είναι 2500 ευρώ\"],\n" +
"        \"5\": [\"Δεν νομίζω\",\"Έτσι διαφημίζουν\",\"Έχει υψηλό ποσοστό απασχολησιμότητας\",\"Μόνο εφόσον ακολουθήσω πιστά το πρόγραμμα\"],\n" +
"        \"6\": [\"Στην παραλία\",\"Σε διάφορα νησιά της Ελλάδας\",\"Σε σύγχρονες εγκαταστάσεις στο κέντρο της Αθήνας\",\"Διαδικτυακά\"],\n" +
"        \"7\": [\"3 μήνες\",\"6 μήνες\",\"500 ώρες\",\"3 ή 6 μήνες με σύνολο 500 ώρες μαθημάτων\"],\n" +
"        \"8\": [\"ο δράκος\",\"ο Τζον Σνόου\",\"ο Σάμγουελ Τάρλυ\",\"ο Χόντορ\"],\n" +
"        \"9\": [\"Jennifer Lopez\",\"’ννα Βίσση\",\"Ariana Grande\",\"Rihanna\"],\n" +
"        \"10\": [\"Ποπάυ\",\"Spider Man\",\"Superman\",\"Chuck Norris\"]\n" +
"      }\n" +
"  },\n" +
"  {\n" +
"    \"correct\": [2,4,2,4,4,3,4,2,3,4]\n" +
"  }\n" +
"]");
		return "restview";
	}

}
