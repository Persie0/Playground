package org.joda.time;

import p000.ux5;

/* JADX INFO: loaded from: classes3.dex */
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

    public IllegalFieldValueException(DateTimeFieldType dateTimeFieldType, String str) {
        String strM18336c = dateTimeFieldType.m18336c();
        StringBuffer stringBuffer = new StringBuffer("Value ");
        if (str == null) {
            stringBuffer.append("null");
        } else {
            stringBuffer.append('\"');
            stringBuffer.append(str);
            stringBuffer.append('\"');
        }
        stringBuffer.append(" for ");
        stringBuffer.append(strM18336c);
        stringBuffer.append(" is not supported");
        super(stringBuffer.toString());
        this.iDateTimeFieldType = dateTimeFieldType;
        this.iDurationFieldType = null;
        this.iFieldName = dateTimeFieldType.m18336c();
        this.iStringValue = str;
        this.iNumberValue = null;
        this.iLowerBound = null;
        this.iUpperBound = null;
        this.iMessage = super.getMessage();
    }

    /* JADX INFO: renamed from: a */
    public static String m18363a(String str, Integer num, Integer num2, Integer num3, String str2) {
        StringBuilder sb = new StringBuilder("Value ");
        sb.append(num);
        sb.append(" for ");
        sb.append(str);
        sb.append(' ');
        if (num2 == null) {
            if (num3 == null) {
                sb.append("is not supported");
            } else {
                sb.append("must not be larger than ");
                sb.append(num3);
            }
        } else if (num3 == null) {
            sb.append("must not be smaller than ");
            sb.append(num2);
        } else {
            sb.append("must be in the range [");
            sb.append(num2);
            sb.append(',');
            sb.append(num3);
            sb.append(']');
        }
        if (str2 != null) {
            sb.append(": ");
            sb.append(str2);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public final void m18364b(String str) {
        if (this.iMessage == null) {
            this.iMessage = str;
            return;
        }
        StringBuilder sbM22999v = ux5.m22999v(str, ": ");
        sbM22999v.append(this.iMessage);
        this.iMessage = sbM22999v.toString();
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.iMessage;
    }

    public IllegalFieldValueException(DateTimeFieldType dateTimeFieldType, Integer num, String str) {
        super(m18363a(dateTimeFieldType.m18336c(), num, null, null, str));
        this.iDateTimeFieldType = dateTimeFieldType;
        this.iDurationFieldType = null;
        this.iFieldName = dateTimeFieldType.m18336c();
        this.iNumberValue = num;
        this.iStringValue = null;
        this.iLowerBound = null;
        this.iUpperBound = null;
        this.iMessage = super.getMessage();
    }

    public IllegalFieldValueException(DateTimeFieldType dateTimeFieldType, Integer num, Integer num2, Integer num3) {
        super(m18363a(dateTimeFieldType.m18336c(), num, num2, num3, null));
        this.iDateTimeFieldType = dateTimeFieldType;
        this.iDurationFieldType = null;
        this.iFieldName = dateTimeFieldType.m18336c();
        this.iNumberValue = num;
        this.iStringValue = null;
        this.iLowerBound = num2;
        this.iUpperBound = num3;
        this.iMessage = super.getMessage();
    }
}
