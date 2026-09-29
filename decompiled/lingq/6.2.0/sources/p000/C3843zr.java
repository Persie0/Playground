package p000;

import com.facebook.appevents.cloudbridge.ConversionsAPISection;
import com.facebook.appevents.cloudbridge.ConversionsAPIUserAndAppDataField;

/* JADX INFO: renamed from: zr */
/* JADX INFO: loaded from: classes2.dex */
public final class C3843zr {

    /* JADX INFO: renamed from: a */
    public final ConversionsAPISection f71990a;

    /* JADX INFO: renamed from: b */
    public final ConversionsAPIUserAndAppDataField f71991b;

    public C3843zr(ConversionsAPISection conversionsAPISection, ConversionsAPIUserAndAppDataField conversionsAPIUserAndAppDataField) {
        conversionsAPISection.getClass();
        this.f71990a = conversionsAPISection;
        this.f71991b = conversionsAPIUserAndAppDataField;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3843zr)) {
            return false;
        }
        C3843zr c3843zr = (C3843zr) obj;
        return this.f71990a == c3843zr.f71990a && this.f71991b == c3843zr.f71991b;
    }

    public final int hashCode() {
        int iHashCode = this.f71990a.hashCode() * 31;
        ConversionsAPIUserAndAppDataField conversionsAPIUserAndAppDataField = this.f71991b;
        return iHashCode + (conversionsAPIUserAndAppDataField == null ? 0 : conversionsAPIUserAndAppDataField.hashCode());
    }

    public final String toString() {
        return "SectionFieldMapping(section=" + this.f71990a + ", field=" + this.f71991b + ')';
    }
}
