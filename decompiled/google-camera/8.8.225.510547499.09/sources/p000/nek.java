package p000;

import java.util.Calendar;
import java.util.Date;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nek extends nel {

    /* JADX INFO: renamed from: c */
    private final nej f42143c;

    public nek(ncj ncjVar, int i, nej nejVar) {
        super(ncjVar, i);
        this.f42143c = nejVar;
        StringBuilder sb = new StringBuilder("%");
        ncjVar.m17336f(sb);
        sb.append(true != ncjVar.m17334d() ? 't' : 'T');
        sb.append(nejVar.f42142G);
    }

    @Override // p000.nel
    /* JADX INFO: renamed from: a */
    public final void mo17417a(nem nemVar, Object obj) {
        nej nejVar = this.f42143c;
        ncj ncjVar = this.f42145b;
        if ((obj instanceof Date) || (obj instanceof Calendar) || (obj instanceof Long)) {
            StringBuilder sb = new StringBuilder("%");
            ncjVar.m17336f(sb);
            sb.append(true != ncjVar.m17334d() ? 't' : 'T');
            sb.append(nejVar.f42142G);
            ((neq) nemVar).f42152d.append(String.format(ncp.f42021a, sb.toString(), obj));
            return;
        }
        neq.m17419d(((neq) nemVar).f42152d, obj, "%t" + nejVar.f42142G);
    }
}
