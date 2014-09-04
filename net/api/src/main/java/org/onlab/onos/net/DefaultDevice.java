package org.onlab.onos.net;

import org.onlab.onos.net.provider.ProviderId;

import java.util.Objects;

import static com.google.common.base.Objects.toStringHelper;

/**
 * Default device model implementation.
 */
public class DefaultDevice extends AbstractElement implements Device {

    private final Type type;
    private final String manufacturer;
    private final String serialNumber;
    private final String hwVersion;
    private final String swVersion;

    /**
     * Creates a network element attributed to the specified provider.
     *
     * @param providerId   identity of the provider
     * @param id           device identifier
     * @param type         device type
     * @param manufacturer device manufacturer
     * @param hwVersion    device HW version
     * @param swVersion    device SW version
     * @param serialNumber device serial number
     */
    public DefaultDevice(ProviderId providerId, DeviceId id, Type type,
                         String manufacturer, String hwVersion, String swVersion,
                         String serialNumber) {
        super(providerId, id);
        this.type = type;
        this.manufacturer = manufacturer;
        this.hwVersion = hwVersion;
        this.swVersion = swVersion;
        this.serialNumber = serialNumber;
    }

    @Override
    public DeviceId id() {
        return (DeviceId) super.id();
    }

    @Override
    public Type type() {
        return type;
    }

    @Override
    public String manufacturer() {
        return manufacturer;
    }

    @Override
    public String hwVersion() {
        return hwVersion;
    }

    @Override
    public String swVersion() {
        return swVersion;
    }

    @Override
    public String serialNumber() {
        return serialNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, manufacturer, hwVersion, swVersion, serialNumber);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof DefaultDevice) {
            final DefaultDevice other = (DefaultDevice) obj;
            return Objects.equals(this.id, other.id) &&
                    Objects.equals(this.type, other.type) &&
                    Objects.equals(this.manufacturer, other.manufacturer) &&
                    Objects.equals(this.hwVersion, other.hwVersion) &&
                    Objects.equals(this.swVersion, other.swVersion) &&
                    Objects.equals(this.serialNumber, other.serialNumber);
        }
        return false;
    }

    @Override
    public String toString() {
        return toStringHelper(this)
                .add("id", id)
                .add("type", type)
                .add("manufacturer", manufacturer)
                .add("hwVersion", hwVersion)
                .add("swVersion", swVersion)
                .add("serialNumber", serialNumber)
                .toString();
    }

}