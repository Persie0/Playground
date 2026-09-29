package p000;

import com.lingq.core.promotions.SaleEventType;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes2.dex */
public final class uk8 {

    /* JADX INFO: renamed from: a */
    public final SaleEventType f64024a;

    /* JADX INFO: renamed from: b */
    public final DateTime f64025b;

    /* JADX INFO: renamed from: c */
    public final DateTime f64026c;

    public uk8(SaleEventType saleEventType, DateTime dateTime, DateTime dateTime2) {
        saleEventType.getClass();
        this.f64024a = saleEventType;
        this.f64025b = dateTime;
        this.f64026c = dateTime2;
    }

    /* JADX INFO: renamed from: a */
    public final DateTime m22768a() {
        return this.f64026c;
    }

    /* JADX INFO: renamed from: b */
    public final DateTime m22769b() {
        return this.f64025b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uk8)) {
            return false;
        }
        uk8 uk8Var = (uk8) obj;
        return this.f64024a == uk8Var.f64024a && this.f64025b.equals(uk8Var.f64025b) && this.f64026c.equals(uk8Var.f64026c);
    }

    public final int hashCode() {
        return (this.f64026c.hashCode() + ((this.f64025b.hashCode() + (this.f64024a.hashCode() * 31)) * 31)) * 31;
    }

    public final String toString() {
        return "SaleEvent(sale=" + this.f64024a + ", dateStart=" + this.f64025b + ", dateEnd=" + this.f64026c + ", countdownOnlyFrom=null)";
    }
}
