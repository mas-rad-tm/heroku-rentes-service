package ch.globaz.tmmas.rentesservice.domain.model;

import ch.globaz.tmmas.rentesservice.domain.model.dossier.Dossier;
import org.junit.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.*;

public class DossierRepositoryTest {

	@Test
	public void assertIfBuilderworkCorrectly () {

		Dossier dossier = Dossier.builder(1L,LocalDate.now());
		assertThat(dossier).isNotNull();
		assertThat(dossier.identifiant()).isNotNull();
		assertThat(dossier.dateEnregistrement()).isNotNull();
	}

}