package p000;

import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jql implements jel {

    /* JADX INFO: renamed from: a */
    public final jqi f34597a;

    /* JADX INFO: renamed from: b */
    private final Status f34598b;

    public jql(Status status, jqi jqiVar) {
        this.f34598b = status;
        this.f34597a = jqiVar;
    }

    @Override // p000.jel
    /* JADX INFO: renamed from: a */
    public final Status mo4644a() {
        return this.f34598b;
    }

    public final String toString() {
        Object[] objArr = new Object[1];
        objArr[0] = Boolean.valueOf(this.f34597a.f34591a == 1);
        return String.format("OptInOptionsResultImpl[%s]", objArr);
    }
}
