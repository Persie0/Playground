package kotlinx.datetime;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.time.DateTimeException;
import p000.cs4;
import p000.hab;
import p000.ij6;
import p000.lma;
import p000.mab;
import p000.mi5;

/* JADX INFO: loaded from: classes3.dex */
public final class Ser implements Externalizable {

    /* JADX INFO: renamed from: a */
    public int f48191a;

    /* JADX INFO: renamed from: b */
    public Serializable f48192b;

    public Ser(int i, Serializable serializable) {
        this.f48191a = i;
        this.f48192b = serializable;
    }

    private final Object readResolve() {
        return this.f48192b;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        Serializable localDate;
        objectInput.getClass();
        byte b = objectInput.readByte();
        this.f48191a = b;
        if (b == 2) {
            java.time.LocalDate localDateOfEpochDay = java.time.LocalDate.ofEpochDay(objectInput.readLong());
            localDateOfEpochDay.getClass();
            localDate = new LocalDate(localDateOfEpochDay);
        } else if (b == 3) {
            mi5 mi5Var = LocalTime.Companion;
            long j = objectInput.readLong();
            mi5Var.getClass();
            try {
                localDate = new LocalTime(java.time.LocalTime.ofNanoOfDay(j));
            } catch (DateTimeException e) {
                throw new IllegalArgumentException(e);
            }
        } else if (b == 4) {
            java.time.LocalDate localDateOfEpochDay2 = java.time.LocalDate.ofEpochDay(objectInput.readLong());
            localDateOfEpochDay2.getClass();
            LocalDate localDate2 = new LocalDate(localDateOfEpochDay2);
            mi5 mi5Var2 = LocalTime.Companion;
            long j2 = objectInput.readLong();
            mi5Var2.getClass();
            try {
                localDate = new LocalDateTime(localDate2, new LocalTime(java.time.LocalTime.ofNanoOfDay(j2)));
            } catch (DateTimeException e2) {
                throw new IllegalArgumentException(e2);
            }
        } else if (b == 10) {
            localDate = lma.m16388a(null, null, Integer.valueOf(objectInput.readInt()));
        } else {
            if (b != 11) {
                throw new IOException("Unknown type tag: " + this.f48191a);
            }
            hab habVar = YearMonth.Companion;
            long j3 = objectInput.readLong();
            cs4 cs4Var = mab.f50857a;
            habVar.getClass();
            long j4 = j3 / 12;
            if ((j3 ^ 12) < 0 && j4 * 12 != j3) {
                j4--;
            }
            long j5 = j3 % 12;
            localDate = new YearMonth((int) (j4 + 1970), ((int) (j5 + (12 & (((j5 ^ 12) & ((-j5) | j5)) >> 63)))) + 1);
        }
        this.f48192b = localDate;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.getClass();
        objectOutput.writeByte(this.f48191a);
        Serializable serializable = this.f48192b;
        int i = this.f48191a;
        if (i == 2) {
            objectOutput.writeLong(((LocalDate) serializable).f48188a.toEpochDay());
            return;
        }
        if (i == 3) {
            objectOutput.writeLong(((LocalTime) serializable).f48190a.toNanoOfDay());
            return;
        }
        if (i == 4) {
            LocalDateTime localDateTime = (LocalDateTime) serializable;
            objectOutput.writeLong(localDateTime.m15603a().f48188a.toEpochDay());
            java.time.LocalTime localTime = localDateTime.f48189a.toLocalTime();
            localTime.getClass();
            new LocalTime(localTime);
            objectOutput.writeLong(localTime.toNanoOfDay());
            return;
        }
        if (i == 10) {
            objectOutput.writeInt(((UtcOffset) serializable).f48194a.getTotalSeconds());
        } else {
            if (i != 11) {
                ij6.m13947d(this.f48191a, " for value: ", serializable, "Unknown type tag: ");
                return;
            }
            cs4 cs4Var = mab.f50857a;
            java.time.YearMonth yearMonth = ((YearMonth) serializable).f48195a;
            objectOutput.writeLong((((((long) yearMonth.getYear()) - 1970) * 12) + ((long) yearMonth.getMonthValue())) - 1);
        }
    }
}
