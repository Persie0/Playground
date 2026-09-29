package p000;

/* JADX INFO: loaded from: classes.dex */
public final class ij4 {

    /* JADX INFO: renamed from: a */
    public final int f44184a;

    /* JADX INFO: renamed from: a */
    public static String m13943a(int i) {
        if (i == 0) {
            return "Unspecified";
        }
        if (i == 1) {
            return "Text";
        }
        if (i == 2) {
            return "Ascii";
        }
        if (i == 3) {
            return "Number";
        }
        if (i == 4) {
            return "Phone";
        }
        if (i == 5) {
            return "Uri";
        }
        if (i == 6) {
            return "Email";
        }
        if (i == 7) {
            return "Password";
        }
        if (i == 8) {
            return "NumberPassword";
        }
        if (i == 9) {
            return "Decimal";
        }
        if (i == 10) {
            return "PasswordVisible";
        }
        if (i == 11) {
            return "PostalAddress";
        }
        if (i == 12) {
            return "PersonName";
        }
        if (i == 13) {
            return "EmailSubject";
        }
        if (i == 14) {
            return "ShortMessage";
        }
        if (i == 15) {
            return "LongMessage";
        }
        if (i == 16) {
            return "Filter";
        }
        if (i == 17) {
            return "Phonetic";
        }
        if (i == 18) {
            return "DateTime";
        }
        if (i == 19) {
            return "Date";
        }
        if (i == 20) {
            return "Time";
        }
        if (i == 21) {
            return "NumberSigned";
        }
        if (i == 22) {
            return "DecimalSigned";
        }
        if (i == 23) {
            return "DecimalPassword";
        }
        if (i == 24) {
            return "NumberPasswordSigned";
        }
        return i == 25 ? "DecimalPasswordSigned" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ij4) {
            return this.f44184a == ((ij4) obj).f44184a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f44184a);
    }

    public final String toString() {
        return m13943a(this.f44184a);
    }
}
