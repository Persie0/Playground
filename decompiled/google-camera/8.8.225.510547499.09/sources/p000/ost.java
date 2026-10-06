package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ost extends CancellationException implements oql {

    /* JADX INFO: renamed from: a */
    public final transient ory f46500a;

    public ost(String str, ory oryVar) {
        super(str);
        this.f46500a = oryVar;
    }

    @Override // p000.oql
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Throwable mo18910a() {
        String message = getMessage();
        if (message == null) {
            message = "";
        }
        ost ostVar = new ost(message, this.f46500a);
        ostVar.initCause(this);
        return ostVar;
    }
}
