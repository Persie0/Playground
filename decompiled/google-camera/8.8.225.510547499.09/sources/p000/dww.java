package p000;

import android.app.Activity;
import android.app.Application;
import android.content.res.Resources;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class dww implements ohi {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f12800a;

    /* JADX INFO: renamed from: b */
    private final Object f12801b;

    public dww(gtd gtdVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f12800a = i;
        this.f12801b = gtdVar;
    }

    public dww(gtd gtdVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f12800a = i;
        this.f12801b = gtdVar;
    }

    public dww(ljf ljfVar, int i, byte[] bArr, byte[] bArr2) {
        this.f12800a = i;
        this.f12801b = ljfVar;
    }

    public dww(oju ojuVar, int i) {
        this.f12800a = i;
        this.f12801b = ojuVar;
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f12800a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return m6836a();
    }

    /* JADX INFO: renamed from: a */
    public final Resources m6836a() {
        switch (this.f12800a) {
            case 0:
                Object obj = ((ljf) this.f12801b).f38372d;
                obj.getClass();
                return (Resources) obj;
            case 1:
                Resources resources = ((dws) this.f12801b).m6830a().getResources();
                resources.getClass();
                return resources;
            case 2:
                Resources resources2 = ((Activity) ((gtd) this.f12801b).f26334a).getResources();
                resources2.getClass();
                return resources2;
            default:
                Resources resources3 = ((Application) ((gtd) this.f12801b).f26334a).getResources();
                resources3.getClass();
                return resources3;
        }
    }
}
