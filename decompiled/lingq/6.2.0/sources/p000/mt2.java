package p000;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class mt2 {

    /* JADX INFO: renamed from: a */
    public final String f51820a;

    /* JADX INFO: renamed from: b */
    public final Map f51821b;

    /* JADX INFO: renamed from: c */
    public final Map f51822c;

    /* JADX INFO: renamed from: d */
    public final Map f51823d;

    /* JADX INFO: renamed from: e */
    public final Map f51824e;

    public mt2(String str, Map map, Map map2, Map map3, Map map4) {
        str.getClass();
        this.f51820a = str;
        this.f51821b = map;
        this.f51822c = map2;
        this.f51823d = map3;
        this.f51824e = map4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mt2)) {
            return false;
        }
        mt2 mt2Var = (mt2) obj;
        return fa4.m11650l(this.f51820a, mt2Var.f51820a) && fa4.m11650l(this.f51821b, mt2Var.f51821b) && fa4.m11650l(this.f51822c, mt2Var.f51822c) && fa4.m11650l(this.f51823d, mt2Var.f51823d) && fa4.m11650l(this.f51824e, mt2Var.f51824e);
    }

    public final int hashCode() {
        int iHashCode = this.f51820a.hashCode() * 31;
        Map map = this.f51821b;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        Map map2 = this.f51822c;
        int iHashCode3 = (iHashCode2 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map map3 = this.f51823d;
        int iHashCode4 = (iHashCode3 + (map3 == null ? 0 : map3.hashCode())) * 31;
        Map map4 = this.f51824e;
        return iHashCode4 + (map4 != null ? map4.hashCode() : 0);
    }

    public final String toString() {
        return "Event(eventType=" + this.f51820a + ", eventProperties=" + this.f51821b + ", userProperties=" + this.f51822c + ", groups=" + this.f51823d + ", groupProperties=" + this.f51824e + ')';
    }
}
