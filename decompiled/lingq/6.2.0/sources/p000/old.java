package p000;

import com.google.android.gms.internal.measurement.AbstractC0965i;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public abstract class old extends AbstractC0965i {

    /* JADX INFO: renamed from: f */
    public final cmd f54560f;

    public old(String str, AbstractC0965i abstractC0965i, cmd cmdVar, fmd fmdVar) {
        super(str, abstractC0965i, fmdVar);
        bna.m3969q(cmdVar.f10295c);
        this.f54560f = cmdVar;
    }

    @Override // p000.gmd
    /* JADX INFO: renamed from: f */
    public final cmd mo12759f() {
        return cmd.m4875a(this.f54560f, mo12760l());
    }

    public old(String str, UUID uuid, String str2, cmd cmdVar, fmd fmdVar) {
        super(str, uuid, str2, fmdVar);
        bna.m3969q(cmdVar.f10295c);
        this.f54560f = cmdVar;
    }
}
