package org.joda.time;

import p003a2.C0009a;

/* JADX INFO: loaded from: classes2.dex */
public class IllegalFieldValueException extends IllegalArgumentException {
    private static final long serialVersionUID = 6305711765985447737L;
    private final DateTimeFieldType iDateTimeFieldType;
    private final DurationFieldType iDurationFieldType;
    private final String iFieldName;
    private final Number iLowerBound;
    private String iMessage;
    private final Number iNumberValue;
    private final String iStringValue;
    private final Number iUpperBound;

    public IllegalFieldValueException(DateTimeFieldType dateTimeFieldType, Integer num, Integer num2, Integer num3) {
        super(m16034a(dateTimeFieldType.m16011c(), num, num2, num3, null));
        this.iDateTimeFieldType = dateTimeFieldType;
        this.iDurationFieldType = null;
        this.iFieldName = dateTimeFieldType.m16011c();
        this.iNumberValue = num;
        this.iStringValue = null;
        this.iLowerBound = num2;
        this.iUpperBound = num3;
        this.iMessage = super.getMessage();
    }

    public IllegalFieldValueException(DateTimeFieldType dateTimeFieldType, Integer num, String str) {
        super(m16034a(dateTimeFieldType.m16011c(), num, null, null, str));
        this.iDateTimeFieldType = dateTimeFieldType;
        this.iDurationFieldType = null;
        this.iFieldName = dateTimeFieldType.m16011c();
        this.iNumberValue = num;
        this.iStringValue = null;
        this.iLowerBound = null;
        this.iUpperBound = null;
        this.iMessage = super.getMessage();
    }

    public IllegalFieldValueException(DateTimeFieldType dateTimeFieldType, String str) {
        String strM16011c = dateTimeFieldType.m16011c();
        StringBuffer stringBuffer = new StringBuffer("Value ");
        if (str == null) {
            stringBuffer.append("null");
        } else {
            stringBuffer.append('\"');
            stringBuffer.append(str);
            stringBuffer.append('\"');
        }
        stringBuffer.append(" for ");
        stringBuffer.append(strM16011c);
        stringBuffer.append(" is not supported");
        super(stringBuffer.toString());
        this.iDateTimeFieldType = dateTimeFieldType;
        this.iDurationFieldType = null;
        this.iFieldName = dateTimeFieldType.m16011c();
        this.iStringValue = str;
        this.iNumberValue = null;
        this.iLowerBound = null;
        this.iUpperBound = null;
        this.iMessage = super.getMessage();
    }

    /* JADX INFO: renamed from: a */
    public static String m16034a(String str, Integer num, Integer num2, Integer num3, String str2) {
        StringBuilder sb2 = new StringBuilder("Value ");
        sb2.append(num);
        sb2.append(" for ");
        sb2.append(str);
        sb2.append(' ');
        if (num2 == null) {
            if (num3 == null) {
                sb2.append("is not supported");
            } else {
                sb2.append("must not be larger than ");
                sb2.append(num3);
            }
        } else if (num3 == null) {
            sb2.append("must not be smaller than ");
            sb2.append(num2);
        } else {
            sb2.append("must be in the range [");
            sb2.append(num2);
            sb2.append(',');
            sb2.append(num3);
            sb2.append(']');
        }
        if (str2 != null) {
            sb2.append(": ");
            sb2.append(str2);
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: b */
    public final void m16035b(String str) {
        if (this.iMessage == null) {
            this.iMessage = str;
        } else if (str != null) {
            StringBuilder sbM26o = C0009a.m26o(str, ": ");
            sbM26o.append(this.iMessage);
            this.iMessage = sbM26o.toString();
        }
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.iMessage;
    }
}
