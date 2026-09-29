package p000;

import com.facebook.appevents.cloudbridge.ConversionsAPICustomEventField;
import com.facebook.appevents.cloudbridge.ConversionsAPISection;

/* JADX INFO: renamed from: yr */
/* JADX INFO: loaded from: classes2.dex */
public final class C3806yr {

    /* JADX INFO: renamed from: a */
    public final ConversionsAPISection f70306a;

    /* JADX INFO: renamed from: b */
    public final ConversionsAPICustomEventField f70307b;

    public C3806yr(ConversionsAPISection conversionsAPISection, ConversionsAPICustomEventField conversionsAPICustomEventField) {
        conversionsAPICustomEventField.getClass();
        this.f70306a = conversionsAPISection;
        this.f70307b = conversionsAPICustomEventField;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3806yr)) {
            return false;
        }
        C3806yr c3806yr = (C3806yr) obj;
        return this.f70306a == c3806yr.f70306a && this.f70307b == c3806yr.f70307b;
    }

    public final int hashCode() {
        ConversionsAPISection conversionsAPISection = this.f70306a;
        return this.f70307b.hashCode() + ((conversionsAPISection == null ? 0 : conversionsAPISection.hashCode()) * 31);
    }

    public final String toString() {
        return "SectionCustomEventFieldMapping(section=" + this.f70306a + ", field=" + this.f70307b + ')';
    }
}
