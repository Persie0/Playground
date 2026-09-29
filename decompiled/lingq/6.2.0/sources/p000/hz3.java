package p000;

import java.util.Map;
import kotlin.collections.AbstractC3194a;

/* JADX INFO: loaded from: classes.dex */
public final class hz3 {

    /* JADX INFO: renamed from: a */
    public final String f43237a;

    /* JADX INFO: renamed from: b */
    public final String f43238b;

    /* JADX INFO: renamed from: c */
    public final Map f43239c;

    public /* synthetic */ hz3(String str, int i, String str2) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, AbstractC3194a.m15360M());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hz3)) {
            return false;
        }
        hz3 hz3Var = (hz3) obj;
        return fa4.m11650l(this.f43237a, hz3Var.f43237a) && fa4.m11650l(this.f43238b, hz3Var.f43238b) && fa4.m11650l(this.f43239c, hz3Var.f43239c);
    }

    public final int hashCode() {
        String str = this.f43237a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f43238b;
        return this.f43239c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Identity(userId=" + ((Object) this.f43237a) + ", deviceId=" + ((Object) this.f43238b) + ", userProperties=" + this.f43239c + ')';
    }

    public hz3(String str, String str2, Map map) {
        map.getClass();
        this.f43237a = str;
        this.f43238b = str2;
        this.f43239c = map;
    }
}
