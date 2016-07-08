package com.iglu.util.config;

import java.io.Serializable;
import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "configApp", eager = true)
@ApplicationScoped
public class ConfigApp implements Serializable {

	private static final long serialVersionUID = 1L;
	private static String baseServer;
	private static boolean emailEstado;
	private static String emailOrigen;
	private static String emailPass;
	private static boolean mailSmtpAuth;
	private static boolean mailSmtpStarttlsEenable;
	private static String mailSmtpHost;
	private static String mailSmtpPort;

	public static String getBaseServer() {
		return baseServer;
	}

	public  void setBaseServer(String baseServer) {
		try {
			ConfigApp.baseServer = "http://" + InetAddress.getLocalHost().getHostAddress() + baseServer;
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			ConfigApp.baseServer = "http://127.0.0.1" + baseServer;
			e.printStackTrace();
		}

	}

	

	public static String getEmailOrigen() {
		return emailOrigen;
	}

	public  void setEmailOrigen(String emailOrigen) {
		ConfigApp.emailOrigen = emailOrigen;
	}

	public static String getEmailPass() {
		return emailPass;
	}

	public  void setEmailPass(String emailPass) {
		ConfigApp.emailPass = emailPass;
	}



	public static String getMailSmtpHost() {
		return mailSmtpHost;
	}

	public  void setMailSmtpHost(String mailSmtpHost) {
		ConfigApp.mailSmtpHost = mailSmtpHost;
	}

	public static String getMailSmtpPort() {
		return mailSmtpPort;
	}

	public  void setMailSmtpPort(String mailSmtpPort) {
		ConfigApp.mailSmtpPort = mailSmtpPort;
	}

	public static boolean isMailSmtpAuth() {
		return mailSmtpAuth;
	}

	public  void setMailSmtpAuth(boolean mailSmtpAuth) {
		ConfigApp.mailSmtpAuth = mailSmtpAuth;
	}

	public static boolean isMailSmtpStarttlsEenable() {
		return mailSmtpStarttlsEenable;
	}

	public  void setMailSmtpStarttlsEenable(boolean mailSmtpStarttlsEenable) {
		ConfigApp.mailSmtpStarttlsEenable = mailSmtpStarttlsEenable;
	}

	public static boolean isEmailEstado() {
		return emailEstado;
	}

	public  void setEmailEstado(boolean emailEstado) {
		ConfigApp.emailEstado = emailEstado;
	}

	//// correo de la empresa y su contraseña...

}