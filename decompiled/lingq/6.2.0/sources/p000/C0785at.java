package p000;

/* JADX INFO: renamed from: at */
/* JADX INFO: loaded from: classes2.dex */
public final class C0785at implements ln3 {

    /* JADX INFO: renamed from: a */
    public final int f7451a;

    public C0785at(int i) {
        this.f7451a = i;
    }

    /* JADX INFO: renamed from: a */
    public final int m3025a() {
        return this.f7451a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0785at) && this.f7451a == ((C0785at) obj).f7451a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f7451a);
    }

    public final String toString() {
        return wq1.m24122r(new StringBuilder("AppWidgetId(appWidgetId="), this.f7451a, ')');
    }
}
