import java.util.Objects;

/**
 * @author zhangwenbin
 * @since 2016/5/25.
 */
public class IPSegment implements Comparable<IPSegment> {

    private long startAddress;
    private long endAddress;

    public long getStartAddress() {
        return startAddress;
    }

    public long getEndAddress() {
        return endAddress;
    }

    public IPSegment(long startAddress, long endAddress) {
        if (startAddress > endAddress) {
            throw new IllegalArgumentException("startAddress cannot greater than endAddress");
        }
        this.startAddress = startAddress;
        this.endAddress = endAddress;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("IPSegment{");
        sb.append("startAddress=").append(startAddress);
        sb.append(", endAddress=").append(endAddress);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(IPSegment o) {
        if (startAddress >= o.startAddress && endAddress <= o.endAddress) {
            return 0;
        }
        if (startAddress < o.startAddress) {
            return 1;
        }
        if (endAddress > o.endAddress) {
            return -1;
        }
        return 0;
    }

}
