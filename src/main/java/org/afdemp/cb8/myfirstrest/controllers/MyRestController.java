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
"    \"questions\": [\"T� ����� �� Coding Bootcamp;\",\"���� ����� � ���������� �������� ��� ���������;\",\"������� ������ ���� ������� ��� �� ��������� ��� ���������;\",\"���� ����� �� ������ ��� ������������;\",\"�� ��� ������� �� ��������������� �� �� ���� ��� Bootcamp;\",\"��� �������� �� ��������;\",\"���� ������� �� ��������� ���������;\",\"����� �� ������ ���� ��������� ����� ��� Game of Thrones;\",\"���� ������������� �� ����������� �� 7 Rings ��� Billboard Music Awards 2019;\",\"����� ��� ���� �������� ������� �� �������� �� �������� Grand Prix ��� F1 ���� �������;\"]\n" +
"      \n" +
"  },\n" +
"  {\n" +
"    \"answers\": \n" +
"      {\n" +
"        \"1\": [\"��� ����� ��������� ������ ��� ���������������\",\"��� ��������� �������� ��������� �� ����� ������� ���������� ���������� ��� ����������� ���� ����� ��� ���������������\",\"��� ����\",\"���� ��� �� ����\"],\n" +
"        \"2\": [\"�� ����� ����������� �� ��� ��������������\",\"�� ����� ��������������� �� ��������� ������ ����� �� ��������� ����� ���� ����������\",\"�� ��������� ���� ������� (������� �2)\",\"��� �� ��������\"],\n" +
"        \"3\": [\"���, ��� ������ ��� 175 ����\",\"��� ��� �������\",\"���� ���� ��� ��� �� ����\",\"������ ��� �� ��������\"],\n" +
"        \"4\": [\"������ ��� �� �� ��������� 2500 ���� ��� �� �������������\",\"���� ������ �� ������� ������ ��������, 5 ���� �� ����\",\"������ �������� 200 �� ����\",\"�� ������ ����� 2500 ����\"],\n" +
"        \"5\": [\"��� ������\",\"���� �����������\",\"���� ����� ������� �����������������\",\"���� ������ ���������� ����� �� ���������\"],\n" +
"        \"6\": [\"���� �������\",\"�� ������� ����� ��� �������\",\"�� ��������� ������������� ��� ������ ��� ������\",\"�����������\"],\n" +
"        \"7\": [\"3 �����\",\"6 �����\",\"500 ����\",\"3 � 6 ����� �� ������ 500 ���� ���������\"],\n" +
"        \"8\": [\"� ������\",\"� ���� �����\",\"� �������� �����\",\"� ������\"],\n" +
"        \"9\": [\"Jennifer Lopez\",\"���� �����\",\"Ariana Grande\",\"Rihanna\"],\n" +
"        \"10\": [\"�����\",\"Spider Man\",\"Superman\",\"Chuck Norris\"]\n" +
"      }\n" +
"  },\n" +
"  {\n" +
"    \"correct\": [2,4,2,4,4,3,4,2,3,4]\n" +
"  }\n" +
"]");
		return "restview";
	}

}
