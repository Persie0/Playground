package p000;

import android.net.Uri;
import android.text.TextUtils;
import androidx.compose.p002ui.node.C0357g;
import androidx.compose.p002ui.node.TraversableNode$Companion$TraverseDescendantsAction;
import com.google.android.gms.internal.measurement.zzsi;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class qba {
    /* JADX INFO: renamed from: a */
    public static final pba m19849a(d16 d16Var, Object obj) {
        k40 k40Var;
        if (!d16Var.f34837a.f34836I) {
            i54.m13663b("visitAncestors called on an unattached node");
        }
        d16 d16Var2 = d16Var.f34837a.f34841e;
        C0357g c0357gM21979L = te1.m21979L(d16Var);
        while (c0357gM21979L != null) {
            if ((((d16) c0357gM21979L.f4335a0.f46679g).f34840d & 262144) != 0) {
                while (d16Var2 != null) {
                    if ((d16Var2.f34839c & 262144) != 0) {
                        d16 d16VarM21992f = d16Var2;
                        x66 x66Var = null;
                        while (d16VarM21992f != null) {
                            if (d16VarM21992f instanceof pba) {
                                pba pbaVar = (pba) d16VarM21992f;
                                if (obj.equals(pbaVar.mo956r())) {
                                    return pbaVar;
                                }
                            }
                            if ((d16VarM21992f.f34839c & 262144) != 0 && (d16VarM21992f instanceof fa2)) {
                                int i = 0;
                                for (d16 d16Var3 = ((fa2) d16VarM21992f).f38701K; d16Var3 != null; d16Var3 = d16Var3.f34842f) {
                                    if ((d16Var3.f34839c & 262144) != 0) {
                                        i++;
                                        if (i == 1) {
                                            d16VarM21992f = d16Var3;
                                        } else {
                                            if (x66Var == null) {
                                                x66Var = new x66(new d16[16]);
                                            }
                                            if (d16VarM21992f != null) {
                                                x66Var.m24305c(d16VarM21992f);
                                                d16VarM21992f = null;
                                            }
                                            x66Var.m24305c(d16Var3);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            d16VarM21992f = te1.m21992f(x66Var);
                        }
                    }
                    d16Var2 = d16Var2.f34841e;
                }
            }
            c0357gM21979L = c0357gM21979L.m1610w();
            d16Var2 = (c0357gM21979L == null || (k40Var = c0357gM21979L.f4335a0) == null) ? null : (ir9) k40Var.f46678f;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static int m19850b(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        if (i == 512) {
            return 9;
        }
        C3386nv.m17626m(ux5.m22988k(i, "type needs to be >= FIRST and <= LAST, type="));
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public static final LinkedHashMap m19851c(JSONObject jSONObject) throws JSONException {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objM19851c = jSONObject.get(next);
            if (objM19851c instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) objM19851c;
                int length = jSONArray.length();
                ArrayList arrayList = new ArrayList(length);
                for (int i = 0; i < length; i++) {
                    arrayList.add(jSONArray.get(i));
                }
                objM19851c = arrayList;
            } else if (objM19851c instanceof JSONObject) {
                objM19851c = m19851c((JSONObject) objM19851c);
            }
            linkedHashMap.put(next, objM19851c);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [vi3] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [d16] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [d16] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [x66] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [x66] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX INFO: renamed from: d */
    public static final void m19852d(ea2 ea2Var, Object obj, vi3 vi3Var) {
        k40 k40Var;
        if (!((d16) ea2Var).f34837a.f34836I) {
            i54.m13663b("visitAncestors called on an unattached node");
        }
        d16 d16Var = ((d16) ea2Var).f34837a.f34841e;
        C0357g c0357gM21979L = te1.m21979L(ea2Var);
        while (c0357gM21979L != null) {
            if ((((d16) c0357gM21979L.f4335a0.f46679g).f34840d & 262144) != 0) {
                while (d16Var != null) {
                    if ((d16Var.f34839c & 262144) != 0) {
                        ?? M21992f = d16Var;
                        ?? x66Var = 0;
                        while (M21992f != 0) {
                            if (M21992f instanceof pba) {
                                pba pbaVar = (pba) M21992f;
                                if (!(obj.equals(pbaVar.mo956r()) ? ((Boolean) vi3Var.invoke(pbaVar)).booleanValue() : true)) {
                                    return;
                                }
                            } else if ((M21992f.f34839c & 262144) != 0 && (M21992f instanceof fa2)) {
                                d16 d16Var2 = ((fa2) M21992f).f38701K;
                                int i = 0;
                                while (d16Var2 != null) {
                                    if ((d16Var2.f34839c & 262144) != 0) {
                                        i++;
                                        if (i == 1) {
                                            M21992f = M21992f;
                                            x66Var = x66Var;
                                            x66Var = x66Var;
                                            M21992f = d16Var2;
                                        } else {
                                            if (x66Var == 0) {
                                                x66Var = new x66(new d16[16]);
                                            }
                                            if (M21992f != 0) {
                                                x66Var.m24305c(M21992f);
                                                M21992f = 0;
                                            }
                                            x66Var.m24305c(d16Var2);
                                        }
                                    } else {
                                        M21992f = M21992f;
                                        x66Var = x66Var;
                                    }
                                    d16Var2 = d16Var2.f34842f;
                                    M21992f = M21992f;
                                    x66Var = x66Var;
                                }
                                if (i == 1) {
                                    M21992f = M21992f;
                                    x66Var = x66Var;
                                } else {
                                    M21992f = M21992f;
                                    x66Var = x66Var;
                                }
                            }
                            M21992f = te1.m21992f(x66Var);
                        }
                    }
                    d16Var = d16Var.f34841e;
                }
            }
            c0357gM21979L = c0357gM21979L.m1610w();
            d16Var = (c0357gM21979L == null || (k40Var = c0357gM21979L.f4335a0) == null) ? null : (ir9) k40Var.f46678f;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [ea2, java.lang.Object, pba] */
    /* JADX WARN: Type inference failed for: r11v0, types: [vi3] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [d16] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [d16] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [x66] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [x66] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX INFO: renamed from: e */
    public static final void m19853e(pba pbaVar, vi3 vi3Var) {
        k40 k40Var;
        d16 d16Var = (d16) pbaVar;
        if (!d16Var.f34837a.f34836I) {
            i54.m13663b("visitAncestors called on an unattached node");
        }
        d16 d16Var2 = d16Var.f34837a.f34841e;
        C0357g c0357gM21979L = te1.m21979L(pbaVar);
        while (c0357gM21979L != null) {
            if ((((d16) c0357gM21979L.f4335a0.f46679g).f34840d & 262144) != 0) {
                while (d16Var2 != null) {
                    if ((d16Var2.f34839c & 262144) != 0) {
                        ?? M21992f = d16Var2;
                        ?? x66Var = 0;
                        while (M21992f != 0) {
                            boolean zBooleanValue = true;
                            if (M21992f instanceof pba) {
                                pba pbaVar2 = (pba) M21992f;
                                if (fa4.m11650l(pbaVar.mo956r(), pbaVar2.mo956r()) && pbaVar.getClass() == pbaVar2.getClass()) {
                                    zBooleanValue = ((Boolean) vi3Var.invoke(pbaVar2)).booleanValue();
                                }
                                if (!zBooleanValue) {
                                    return;
                                }
                            } else if ((M21992f.f34839c & 262144) != 0 && (M21992f instanceof fa2)) {
                                d16 d16Var3 = ((fa2) M21992f).f38701K;
                                int i = 0;
                                while (d16Var3 != null) {
                                    if ((d16Var3.f34839c & 262144) != 0) {
                                        i++;
                                        if (i == 1) {
                                            M21992f = M21992f;
                                            x66Var = x66Var;
                                            x66Var = x66Var;
                                            M21992f = d16Var3;
                                        } else {
                                            if (x66Var == 0) {
                                                x66Var = new x66(new d16[16]);
                                            }
                                            if (M21992f != 0) {
                                                x66Var.m24305c(M21992f);
                                                M21992f = 0;
                                            }
                                            x66Var.m24305c(d16Var3);
                                        }
                                    } else {
                                        M21992f = M21992f;
                                        x66Var = x66Var;
                                    }
                                    d16Var3 = d16Var3.f34842f;
                                    M21992f = M21992f;
                                    x66Var = x66Var;
                                }
                                if (i == 1) {
                                    M21992f = M21992f;
                                    x66Var = x66Var;
                                } else {
                                    M21992f = M21992f;
                                    x66Var = x66Var;
                                }
                            }
                            M21992f = te1.m21992f(x66Var);
                        }
                    }
                    d16Var2 = d16Var2.f34841e;
                }
            }
            c0357gM21979L = c0357gM21979L.m1610w();
            d16Var2 = (c0357gM21979L == null || (k40Var = c0357gM21979L.f4335a0) == null) ? null : (ir9) k40Var.f46678f;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [vi3] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [d16] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [d16] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [x66] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [x66] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX INFO: renamed from: f */
    public static final void m19854f(d16 d16Var, String str, vi3 vi3Var) {
        if (!d16Var.f34837a.f34836I) {
            i54.m13663b("visitSubtreeIf called on an unattached node");
        }
        x66 x66Var = new x66(new d16[16]);
        d16 d16Var2 = d16Var.f34837a;
        d16 d16Var3 = d16Var2.f34842f;
        if (d16Var3 == null) {
            te1.m21990d(x66Var, d16Var2);
        } else {
            x66Var.m24305c(d16Var3);
        }
        while (true) {
            int i = x66Var.f67832c;
            if (i == 0) {
                return;
            }
            d16 d16Var4 = (d16) x66Var.m24314l(i - 1);
            if ((d16Var4.f34840d & 262144) != 0) {
                d16 d16Var5 = d16Var4;
                while (true) {
                    if (d16Var5 != null && d16Var5.f34836I) {
                        if ((d16Var5.f34839c & 262144) != 0) {
                            ?? M21992f = d16Var5;
                            ?? x66Var2 = 0;
                            while (M21992f != 0) {
                                if (M21992f instanceof pba) {
                                    pba pbaVar = (pba) M21992f;
                                    TraversableNode$Companion$TraverseDescendantsAction traversableNode$Companion$TraverseDescendantsAction = str.equals(pbaVar.mo956r()) ? (TraversableNode$Companion$TraverseDescendantsAction) vi3Var.invoke(pbaVar) : TraversableNode$Companion$TraverseDescendantsAction.ContinueTraversal;
                                    if (traversableNode$Companion$TraverseDescendantsAction != TraversableNode$Companion$TraverseDescendantsAction.CancelTraversal) {
                                        if (traversableNode$Companion$TraverseDescendantsAction == TraversableNode$Companion$TraverseDescendantsAction.SkipSubtreeAndContinueTraversal) {
                                            break;
                                        }
                                    } else {
                                        return;
                                    }
                                } else if ((M21992f.f34839c & 262144) != 0 && (M21992f instanceof fa2)) {
                                    d16 d16Var6 = ((fa2) M21992f).f38701K;
                                    int i2 = 0;
                                    M21992f = M21992f;
                                    x66Var2 = x66Var2;
                                    while (d16Var6 != null) {
                                        if ((d16Var6.f34839c & 262144) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                x66Var2 = x66Var2;
                                                M21992f = d16Var6;
                                            } else {
                                                if (x66Var2 == 0) {
                                                    x66Var2 = new x66(new d16[16]);
                                                }
                                                if (M21992f != 0) {
                                                    x66Var2.m24305c(M21992f);
                                                    M21992f = 0;
                                                }
                                                x66Var2.m24305c(d16Var6);
                                            }
                                        }
                                        d16Var6 = d16Var6.f34842f;
                                        M21992f = M21992f;
                                        x66Var2 = x66Var2;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                M21992f = te1.m21992f(x66Var2);
                            }
                        }
                        d16Var5 = d16Var5.f34842f;
                    }
                }
            }
            te1.m21990d(x66Var, d16Var4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, pba] */
    /* JADX WARN: Type inference failed for: r13v0, types: [vi3] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [d16] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [d16] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [x66] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [x66] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX INFO: renamed from: g */
    public static final void m19855g(pba pbaVar, vi3 vi3Var) {
        d16 d16Var = (d16) pbaVar;
        if (!d16Var.f34837a.f34836I) {
            i54.m13663b("visitSubtreeIf called on an unattached node");
        }
        x66 x66Var = new x66(new d16[16]);
        d16 d16Var2 = d16Var.f34837a;
        d16 d16Var3 = d16Var2.f34842f;
        if (d16Var3 == null) {
            te1.m21990d(x66Var, d16Var2);
        } else {
            x66Var.m24305c(d16Var3);
        }
        while (true) {
            int i = x66Var.f67832c;
            if (i == 0) {
                return;
            }
            d16 d16Var4 = (d16) x66Var.m24314l(i - 1);
            if ((d16Var4.f34840d & 262144) != 0) {
                d16 d16Var5 = d16Var4;
                while (true) {
                    if (d16Var5 != null && d16Var5.f34836I) {
                        if ((d16Var5.f34839c & 262144) != 0) {
                            ?? M21992f = d16Var5;
                            ?? x66Var2 = 0;
                            while (M21992f != 0) {
                                if (M21992f instanceof pba) {
                                    pba pbaVar2 = (pba) M21992f;
                                    TraversableNode$Companion$TraverseDescendantsAction traversableNode$Companion$TraverseDescendantsAction = (fa4.m11650l(pbaVar.mo956r(), pbaVar2.mo956r()) && pbaVar.getClass() == pbaVar2.getClass()) ? (TraversableNode$Companion$TraverseDescendantsAction) vi3Var.invoke(pbaVar2) : TraversableNode$Companion$TraverseDescendantsAction.ContinueTraversal;
                                    if (traversableNode$Companion$TraverseDescendantsAction != TraversableNode$Companion$TraverseDescendantsAction.CancelTraversal) {
                                        if (traversableNode$Companion$TraverseDescendantsAction == TraversableNode$Companion$TraverseDescendantsAction.SkipSubtreeAndContinueTraversal) {
                                            break;
                                        }
                                    } else {
                                        return;
                                    }
                                } else if ((M21992f.f34839c & 262144) != 0 && (M21992f instanceof fa2)) {
                                    d16 d16Var6 = ((fa2) M21992f).f38701K;
                                    int i2 = 0;
                                    M21992f = M21992f;
                                    x66Var2 = x66Var2;
                                    while (d16Var6 != null) {
                                        if ((d16Var6.f34839c & 262144) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                x66Var2 = x66Var2;
                                                M21992f = d16Var6;
                                            } else {
                                                if (x66Var2 == 0) {
                                                    x66Var2 = new x66(new d16[16]);
                                                }
                                                if (M21992f != 0) {
                                                    x66Var2.m24305c(M21992f);
                                                    M21992f = 0;
                                                }
                                                x66Var2.m24305c(d16Var6);
                                            }
                                        }
                                        d16Var6 = d16Var6.f34842f;
                                        M21992f = M21992f;
                                        x66Var2 = x66Var2;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                M21992f = te1.m21992f(x66Var2);
                            }
                        }
                        d16Var5 = d16Var5.f34842f;
                    }
                }
            }
            te1.m21990d(x66Var, d16Var4);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final File m19856h(Uri uri) throws zzsi {
        if (!uri.getScheme().equals("file")) {
            throw new zzsi("Scheme must be 'file'");
        }
        if (!TextUtils.isEmpty(uri.getQuery())) {
            throw new zzsi("Did not expect uri to have query");
        }
        if (TextUtils.isEmpty(uri.getAuthority())) {
            return new File(uri.getPath());
        }
        throw new zzsi("Did not expect uri to have authority");
    }
}
