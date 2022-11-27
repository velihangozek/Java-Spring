package com.hibernatedemo;

// import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(City.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {
			session.beginTransaction();
			// List<City> cities =
//			 List<String> countryCodes =
//					// HQL --> Hibernate Query Language
//					// from City c where c.countryCode='TUR' AND c.district='Karadeniz'
//					// from City c where c.name LIKE '%kar%'
//					// from City c ORDER BY c.name DESC
//					session.createQuery("select c.countryCode from City c GROUP BY c.countryCode")
//					.getResultList();
//			// for (City city : cities) {
//			 for (String countryCode : countryCodes) {
//				// System.out.println(city.getCountryCode());
//				 System.out.println(countryCode);
//			}

			// INSERT
//			City city = new City();
//			city.setName("Düzce 13");
//			city.setCountryCode("TUR");
//			city.setDistrict("Karadeniz");
//			city.setPopulation(171_000);
//			session.save(city);

			// UPDATE
//			City city = session.get(City.class, 4096);
//			// System.out.println(city.getName()); // --> Check if it's really fetched.
//			city.setPopulation(303_000);
//			// System.out.println(session.save(city).getClass().getName()); // type of ID
//			session.save(city);

			// DELETE METHOD 1
			City city = session.get(City.class, 4091);
			session.delete(city);
//			// session.save(city); --> INSERTs if not existed.
			session.getTransaction().commit();
//			// DELETE OUTPUT
			System.out.println(city.getName() + " is successfully deleted from the Database!");
			// UPDATE OUTPUT
			// System.out.println(city.getName() + " is successfully updated in the
			// Database!");
			// INSERT OUTPUT
			// System.out.println(city.getName() + " is successfully added to the
			// Database!");

			// DELETE METHOD 2
//			session.createQuery("DELETE FROM City c where c.id=4092").executeUpdate();
//			session.getTransaction().commit();
//			System.out.println("Deleted successfully!");
		} finally {
			factory.close();
		}
	}
}