package p000;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bpc extends ContextWrapper {

    /* JADX INFO: renamed from: a */
    static final bpq f4040a = new bow();

    /* JADX INFO: renamed from: b */
    public final btg f4041b;

    /* JADX INFO: renamed from: c */
    public final List f4042c;

    /* JADX INFO: renamed from: d */
    public final Map f4043d;

    /* JADX INFO: renamed from: e */
    public final int f4044e;

    /* JADX INFO: renamed from: f */
    public final bko f4045f;

    /* JADX INFO: renamed from: g */
    public final bzq f4046g;

    /* JADX INFO: renamed from: h */
    public final ljf f4047h;

    /* JADX INFO: renamed from: i */
    private final cbc f4048i;

    /* JADX INFO: renamed from: j */
    private cab f4049j;

    public bpc(Context context, btg btgVar, cbc cbcVar, bzq bzqVar, Map map, List list, ljf ljfVar, bko bkoVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        super(context.getApplicationContext());
        this.f4041b = btgVar;
        this.f4046g = bzqVar;
        this.f4042c = list;
        this.f4043d = map;
        this.f4047h = ljfVar;
        this.f4045f = bkoVar;
        this.f4044e = 4;
        this.f4048i = bzq.m3279s(cbcVar);
    }

    /* JADX INFO: renamed from: a */
    public final bpk m2831a() {
        return (bpk) this.f4048i.mo2844a();
    }

    /* JADX INFO: renamed from: b */
    public final synchronized cab m2832b() {
        if (this.f4049j == null) {
            cab cabVar = new cab();
            cabVar.m3304N();
            this.f4049j = cabVar;
        }
        return this.f4049j;
    }
}
