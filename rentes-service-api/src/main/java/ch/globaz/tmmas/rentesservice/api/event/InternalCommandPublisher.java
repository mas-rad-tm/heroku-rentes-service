package ch.globaz.tmmas.rentesservice.api.event;


import ch.globaz.tmmas.rentesservice.domain.command.DomainCommand;

public interface InternalCommandPublisher {

	void publishCommand(DomainCommand command);
}
