package p000;

import android.view.ViewGroup;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class opd implements opa {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f46369a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f46370b;

    public opd(ViewGroup viewGroup, int i) {
        this.f46370b = i;
        this.f46369a = viewGroup;
    }

    public opd(Iterator it, int i) {
        this.f46370b = i;
        this.f46369a = it;
    }

    public opd(onm onmVar, int i) {
        this.f46370b = i;
        this.f46369a = onmVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, onm] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Iterator] */
    @Override // p000.opa
    /* JADX INFO: renamed from: a */
    public final Iterator mo18817a() {
        switch (this.f46370b) {
            case 0:
                ?? r0 = this.f46369a;
                opb opbVar = new opb();
                opbVar.f46365a = omn.m18700e(r0, opbVar, opbVar);
                return opbVar;
            case 1:
                return new lgh((ViewGroup) this.f46369a, 1);
            default:
                return this.f46369a;
        }
    }
}
