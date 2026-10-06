package p000;

import android.graphics.Rect;
import com.google.android.libraries.lens.lenslite.api.arLu.YmzeHXaMYOLk;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fyc implements fzu {

    /* JADX INFO: renamed from: a */
    public final kbo f23867a;

    /* JADX INFO: renamed from: b */
    public final kbz f23868b;

    /* JADX INFO: renamed from: c */
    public final grc f23869c;

    /* JADX INFO: renamed from: d */
    public final Executor f23870d = jzn.m13821i("LuckyShotEx");

    /* JADX INFO: renamed from: e */
    public final Rect f23871e;

    /* JADX INFO: renamed from: f */
    private final cem f23872f;

    /* JADX INFO: renamed from: g */
    private final fzu f23873g;

    /* JADX INFO: renamed from: h */
    private final gro f23874h;

    public fyc(kbn kbnVar, cem cemVar, grc grcVar, gdz gdzVar, gro groVar, fzu fzuVar, kbz kbzVar) {
        this.f23867a = kbnVar.mo6314a(YmzeHXaMYOLk.wUBhWX);
        this.f23868b = kbzVar;
        this.f23872f = cemVar;
        this.f23873g = fzuVar;
        this.f23869c = grcVar;
        this.f23871e = gdzVar.f24349c;
        this.f23874h = groVar;
    }

    @Override // p000.fzu
    /* JADX INFO: renamed from: a */
    public final fzt mo3603a(glk glkVar) {
        fzt fztVarMo3603a = this.f23873g.mo3603a(glkVar);
        fztVarMo3603a.getClass();
        return new fyb(this, glkVar, fztVarMo3603a, this.f23872f, this.f23874h, null, null);
    }

    @Override // p000.fzu
    /* JADX INFO: renamed from: b */
    public final fzt mo3604b(glk glkVar) {
        fzt fztVarMo3604b = this.f23873g.mo3604b(glkVar);
        fztVarMo3604b.getClass();
        return new fyb(this, glkVar, fztVarMo3604b, this.f23872f, this.f23874h, null, null);
    }
}
