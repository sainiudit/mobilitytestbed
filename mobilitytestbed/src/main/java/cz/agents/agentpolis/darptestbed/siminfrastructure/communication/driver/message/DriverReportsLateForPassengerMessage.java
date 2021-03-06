package cz.agents.agentpolis.darptestbed.siminfrastructure.communication.driver.message;

import cz.agents.agentpolis.darptestbed.siminfrastructure.communication.dispatching.receiver.DispatchingReceiverVisitor;
import cz.agents.agentpolis.darptestbed.siminfrastructure.communication.requestconsumer.receiver.RequestConsumerReceiverVisitor;
import cz.agents.agentpolis.darptestbed.simmodel.agent.data.TripInfo;
import cz.agents.agentpolis.ondemandtransport.siminfrastructure.communication.protocol.MessageVisitor;

public class DriverReportsLateForPassengerMessage implements MessageVisitor<DispatchingReceiverVisitor> {
    public final String passengerId;
    public final TripInfo tripInfo;

    public DriverReportsLateForPassengerMessage(String passengerId, TripInfo tripInfo) {
        super();
        this.passengerId = passengerId;
        this.tripInfo = tripInfo;
    }

    @Override
    public void accept(DispatchingReceiverVisitor receiverVisitor) {
        receiverVisitor.visit(this);
    }

    @Override
    public String toString() {
        return "DriverReportsLateForPassengerMessage{" +
                "passengerId='" + passengerId + '\'' +
                ", tripInfo=" + tripInfo +
                '}';
    }
}
