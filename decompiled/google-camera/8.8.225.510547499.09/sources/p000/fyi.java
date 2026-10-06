package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fyi implements fzu {

    /* JADX INFO: renamed from: a */
    public final Executor f23904a;

    /* JADX INFO: renamed from: b */
    public final dhv f23905b;

    public fyi(Executor executor, dhv dhvVar) {
        this.f23904a = executor;
        this.f23905b = dhvVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [gyh, java.lang.Object] */
    @Override // p000.fzu
    /* JADX INFO: renamed from: a */
    public final fzt mo3603a(glk glkVar) {
        return new fyh(this, glkVar.f25502c);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [gyh, java.lang.Object] */
    @Override // p000.fzu
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final fyh mo3604b(glk glkVar) {
        return new fyh(this, glkVar.f25502c);
    }
}
