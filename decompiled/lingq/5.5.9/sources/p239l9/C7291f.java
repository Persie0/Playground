package p239l9;

import java.util.UUID;
import p218k9.InterfaceC6632b;
import p479xa.C10134c0;

/* JADX INFO: renamed from: l9.f */
/* JADX INFO: loaded from: classes.dex */
public final class C7291f implements InterfaceC6632b {

    /* JADX INFO: renamed from: d */
    public static final boolean f40805d;

    /* JADX INFO: renamed from: a */
    public final UUID f40806a;

    /* JADX INFO: renamed from: b */
    public final byte[] f40807b;

    /* JADX INFO: renamed from: c */
    public final boolean f40808c;

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    static {
        boolean z10;
        if ("Amazon".equals(C10134c0.f51356c)) {
            String str = C10134c0.f51357d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        f40805d = z10;
    }

    public C7291f(UUID uuid, byte[] bArr, boolean z10) {
        this.f40806a = uuid;
        this.f40807b = bArr;
        this.f40808c = z10;
    }
}
