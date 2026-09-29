package org.joda.time.p022tz;

import java.io.DataInput;
import java.io.IOException;
import org.joda.time.DateTimeZone;
import p000.v63;

/* JADX INFO: renamed from: org.joda.time.tz.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3433a {
    /* JADX INFO: renamed from: a */
    public static DateTimeZone m18456a(DataInput dataInput, String str) throws IOException {
        int unsignedByte = dataInput.readUnsignedByte();
        if (unsignedByte == 67) {
            return new CachedDateTimeZone(DateTimeZoneBuilder$PrecalculatedZone.m18455v(dataInput, str));
        }
        if (unsignedByte == 70) {
            FixedDateTimeZone fixedDateTimeZone = new FixedDateTimeZone(str, (int) m18457b(dataInput), (int) m18457b(dataInput), dataInput.readUTF());
            DateTimeZone dateTimeZone = DateTimeZone.f54829a;
            return fixedDateTimeZone.equals(dateTimeZone) ? dateTimeZone : fixedDateTimeZone;
        }
        if (unsignedByte == 80) {
            return DateTimeZoneBuilder$PrecalculatedZone.m18455v(dataInput, str);
        }
        v63.m23133k("Invalid encoding");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static long m18457b(DataInput dataInput) throws IOException {
        long unsignedByte;
        long j;
        int unsignedByte2 = dataInput.readUnsignedByte();
        int i = unsignedByte2 >> 6;
        if (i == 1) {
            unsignedByte = dataInput.readUnsignedByte() | ((unsignedByte2 << 26) >> 2) | (dataInput.readUnsignedByte() << 16) | (dataInput.readUnsignedByte() << 8);
            j = 60000;
        } else if (i == 2) {
            unsignedByte = ((((long) unsignedByte2) << 58) >> 26) | ((long) (dataInput.readUnsignedByte() << 24)) | ((long) (dataInput.readUnsignedByte() << 16)) | ((long) (dataInput.readUnsignedByte() << 8)) | ((long) dataInput.readUnsignedByte());
            j = 1000;
        } else {
            if (i == 3) {
                return dataInput.readLong();
            }
            unsignedByte = (unsignedByte2 << 26) >> 26;
            j = 1800000;
        }
        return unsignedByte * j;
    }
}
