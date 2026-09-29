package p047ce;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.C2766n1;
import com.google.android.gms.internal.measurement.C2779o1;
import com.google.android.gms.internal.measurement.C2870v1;
import com.google.android.gms.internal.measurement.zzja;
import de.C5154a;
import de.C5156c;
import de.C5158e;
import java.util.concurrent.ConcurrentHashMap;
import p031bc.C1356a;
import p155he.C6038b;
import p176ib.C6272i;

/* JADX INFO: renamed from: ce.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2001c implements InterfaceC1999a {

    /* JADX INFO: renamed from: c */
    public static volatile C2001c f10440c;

    /* JADX INFO: renamed from: a */
    public final C1356a f10441a;

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f10442b;

    public C2001c(C1356a c1356a) {
        C6272i.m12915i(c1356a);
        this.f10441a = c1356a;
        this.f10442b = new ConcurrentHashMap();
    }

    @Override // p047ce.InterfaceC1999a
    /* JADX INFO: renamed from: a */
    public final C2000b mo5933a(String str, C6038b c6038b) {
        Object c5158e;
        boolean z10 = true;
        if (!(!C5154a.f33149c.contains(str))) {
            return null;
        }
        boolean zIsEmpty = str.isEmpty();
        ConcurrentHashMap concurrentHashMap = this.f10442b;
        if (zIsEmpty || !concurrentHashMap.containsKey(str) || concurrentHashMap.get(str) == null) {
            z10 = false;
        }
        if (z10) {
            return null;
        }
        boolean zEquals = "fiam".equals(str);
        C1356a c1356a = this.f10441a;
        if (zEquals) {
            c5158e = new C5156c(c1356a, c6038b);
        } else {
            c5158e = "clx".equals(str) ? new C5158e(c1356a, c6038b) : null;
        }
        if (c5158e == null) {
            return null;
        }
        concurrentHashMap.put(str, c5158e);
        return new C2000b();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003c  */
    /* JADX WARN: Code duplicated, block: B:18:0x003e  */
    /* JADX WARN: Code duplicated, block: B:21:0x004b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0057  */
    /* JADX WARN: Code duplicated, block: B:26:0x0061  */
    /* JADX WARN: Code duplicated, block: B:31:0x007e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0084  */
    /* JADX WARN: Code duplicated, block: B:39:0x0096  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:51:0x00bb A[EDGE_INSN: B:51:0x00bb->B:55:0x00d3 BREAK  A[LOOP:0: B:25:0x005f->B:66:?]] */
    /* JADX WARN: Code duplicated, block: B:52:0x00bd A[EDGE_INSN: B:52:0x00bd->B:55:0x00d3 BREAK  A[LOOP:0: B:25:0x005f->B:66:?]] */
    /* JADX WARN: Code duplicated, block: B:53:0x00c4 A[EDGE_INSN: B:53:0x00c4->B:55:0x00d3 BREAK  A[LOOP:0: B:25:0x005f->B:66:?]] */
    /* JADX WARN: Code duplicated, block: B:54:0x00cc A[EDGE_INSN: B:54:0x00cc->B:55:0x00d3 BREAK  A[LOOP:0: B:25:0x005f->B:66:?]] */
    /* JADX WARN: Code duplicated, block: B:56:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:64:0x0073 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:? A[LOOP:0: B:25:0x005f->B:66:?, LOOP_END, SYNTHETIC] */
    @Override // p047ce.InterfaceC1999a
    /* JADX INFO: renamed from: b */
    public final void mo5934b(String str, String str2, Bundle bundle) {
        boolean z10;
        zzja zzjaVar;
        int size;
        int i10;
        int iHashCode;
        byte b10;
        boolean zContainsKey;
        boolean z11 = true;
        if (!C5154a.f33149c.contains(str)) {
            if (!C5154a.f33148b.contains(str2)) {
                zzja zzjaVar2 = C5154a.f33150d;
                int size2 = zzjaVar2.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size2) {
                        z10 = true;
                        break;
                    } else {
                        boolean zContainsKey2 = bundle.containsKey((String) zzjaVar2.get(i11));
                        i11++;
                        if (zContainsKey2) {
                        }
                    }
                }
                if (z10) {
                    if ("_cmp".equals(str2)) {
                        if (!C5154a.f33149c.contains(str)) {
                            z11 = false;
                            break;
                        }
                        zzjaVar = C5154a.f33150d;
                        size = zzjaVar.size();
                        i10 = 0;
                        while (true) {
                            if (i10 >= size) {
                                iHashCode = str.hashCode();
                                if (iHashCode != 101200) {
                                    if (iHashCode != 101230) {
                                        if (iHashCode != 3142703 && str.equals("fiam")) {
                                            b10 = 2;
                                        } else {
                                            b10 = -1;
                                        }
                                    } else if (str.equals("fdl")) {
                                        b10 = 1;
                                    } else {
                                        b10 = -1;
                                    }
                                } else if (str.equals("fcm")) {
                                    b10 = 0;
                                } else {
                                    b10 = -1;
                                }
                                if (b10 != 0) {
                                    bundle.putString("_cis", "fcm_integration");
                                    break;
                                } else if (b10 != 1) {
                                    bundle.putString("_cis", "fdl_integration");
                                    break;
                                } else {
                                    if (b10 != 2) {
                                        bundle.putString("_cis", "fiam_integration");
                                        break;
                                    }
                                    break;
                                }
                            }
                            zContainsKey = bundle.containsKey((String) zzjaVar.get(i10));
                            i10++;
                            if (zContainsKey) {
                            }
                            z11 = false;
                            break;
                        }
                    }
                    if (z11) {
                        if ("clx".equals(str) && "_ae".equals(str2)) {
                            bundle.putLong("_r", 1L);
                        }
                        C2870v1 c2870v1 = this.f10441a.f8191a;
                        c2870v1.getClass();
                        c2870v1.m8300b(new C2766n1(c2870v1, str, str2, bundle, true));
                    }
                }
                return;
            }
            z10 = false;
            if (z10) {
                return;
            }
            if ("_cmp".equals(str2)) {
                if (!C5154a.f33149c.contains(str)) {
                    zzjaVar = C5154a.f33150d;
                    size = zzjaVar.size();
                    i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            iHashCode = str.hashCode();
                            if (iHashCode != 101200) {
                                if (iHashCode != 101230) {
                                    if (iHashCode != 3142703) {
                                        b10 = -1;
                                    } else {
                                        b10 = 2;
                                    }
                                } else if (str.equals("fdl")) {
                                    b10 = 1;
                                } else {
                                    b10 = -1;
                                }
                            } else if (str.equals("fcm")) {
                                b10 = 0;
                            } else {
                                b10 = -1;
                            }
                            if (b10 != 0) {
                                bundle.putString("_cis", "fcm_integration");
                                break;
                            } else if (b10 != 1) {
                                bundle.putString("_cis", "fdl_integration");
                                break;
                            } else {
                                if (b10 != 2) {
                                    bundle.putString("_cis", "fiam_integration");
                                    break;
                                }
                                break;
                            }
                        }
                        zContainsKey = bundle.containsKey((String) zzjaVar.get(i10));
                        i10++;
                        if (zContainsKey) {
                        }
                        z11 = false;
                        break;
                    }
                } else {
                    z11 = false;
                    break;
                }
            }
            if (z11) {
                if ("clx".equals(str)) {
                    bundle.putLong("_r", 1L);
                }
                C2870v1 c2870v2 = this.f10441a.f8191a;
                c2870v2.getClass();
                c2870v2.m8300b(new C2766n1(c2870v2, str, str2, bundle, true));
            }
        }
    }

    @Override // p047ce.InterfaceC1999a
    /* JADX INFO: renamed from: c */
    public final void mo5935c(String str) {
        if (!C5154a.f33149c.contains("fcm")) {
            C2870v1 c2870v1 = this.f10441a.f8191a;
            c2870v1.getClass();
            c2870v1.m8300b(new C2779o1(c2870v1, "fcm", "_ln", str, true));
        }
    }
}
