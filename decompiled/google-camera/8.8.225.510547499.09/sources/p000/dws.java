package p000;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class dws implements ohi {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f12795a;

    /* JADX INFO: renamed from: b */
    private final Object f12796b;

    public dws(cwd cwdVar, int i, byte[] bArr, byte[] bArr2) {
        this.f12795a = i;
        this.f12796b = cwdVar;
    }

    public dws(cwd cwdVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f12795a = i;
        this.f12796b = cwdVar;
    }

    public dws(djm djmVar, int i) {
        this.f12795a = i;
        this.f12796b = djmVar;
    }

    public dws(gtd gtdVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f12795a = i;
        this.f12796b = gtdVar;
    }

    public dws(gtd gtdVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f12795a = i;
        this.f12796b = gtdVar;
    }

    public dws(ljf ljfVar, int i, byte[] bArr, byte[] bArr2) {
        this.f12795a = i;
        this.f12796b = ljfVar;
    }

    public dws(lyz lyzVar, int i, byte[] bArr) {
        this.f12795a = i;
        this.f12796b = lyzVar;
    }

    public dws(oju ojuVar, int i) {
        this.f12795a = i;
        this.f12796b = ojuVar;
    }

    /* JADX INFO: renamed from: b */
    public static Context m6828b(cwd cwdVar) {
        Object obj = cwdVar.f9866a;
        obj.getClass();
        return (Context) obj;
    }

    /* JADX INFO: renamed from: c */
    public static dws m6829c(gtd gtdVar) {
        return new dws(gtdVar, 2, null, null, null, null);
    }

    /* JADX INFO: renamed from: a */
    public final Context m6830a() {
        switch (this.f12795a) {
            case 0:
                Object obj = ((ljf) this.f12796b).f38373e;
                obj.getClass();
                return (Context) obj;
            case 1:
                return (Context) ((djm) this.f12796b).f11789c;
            case 2:
                return (Context) ((gtd) this.f12796b).f26334a;
            case 3:
                return (Context) ((gtd) this.f12796b).f26335b;
            case 4:
                return (Context) ((gtd) this.f12796b).f26335b;
            case 5:
                return (Context) ((cwd) this.f12796b).f9866a;
            case 6:
                return m6828b((cwd) this.f12796b);
            case 7:
                Context context = ((hlz) this.f12796b).get().f36967l;
                context.getClass();
                return context;
            default:
                return (Context) ((lyz) this.f12796b).f39584a;
        }
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f12795a) {
            case 0:
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                break;
        }
        return m6830a();
    }
}
