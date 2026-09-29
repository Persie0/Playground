package p453w9;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.ParserException;
import com.kochava.tracker.BuildConfig;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261m9.C7504e;
import p261m9.C7519t;
import p261m9.InterfaceC7507h;
import p261m9.InterfaceC7508i;
import p261m9.InterfaceC7509j;
import p261m9.InterfaceC7520u;
import p338qd.C8573r0;
import p357r6.C8739a;
import p479xa.C10129a;
import p479xa.C10130a0;
import p479xa.C10134c0;
import p479xa.C10145n;
import p479xa.C10151t;

/* JADX INFO: renamed from: w9.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class C9850c0 implements InterfaceC7507h {

    /* JADX INFO: renamed from: a */
    public final int f50094a;

    /* JADX INFO: renamed from: b */
    public final List<C10130a0> f50095b;

    /* JADX INFO: renamed from: c */
    public final C10151t f50096c;

    /* JADX INFO: renamed from: d */
    public final SparseIntArray f50097d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC9852d0.c f50098e;

    /* JADX INFO: renamed from: f */
    public final SparseArray<InterfaceC9852d0> f50099f;

    /* JADX INFO: renamed from: g */
    public final SparseBooleanArray f50100g;

    /* JADX INFO: renamed from: h */
    public final SparseBooleanArray f50101h;

    /* JADX INFO: renamed from: i */
    public final C9848b0 f50102i;

    /* JADX INFO: renamed from: j */
    public C9846a0 f50103j;

    /* JADX INFO: renamed from: k */
    public InterfaceC7509j f50104k;

    /* JADX INFO: renamed from: l */
    public int f50105l;

    /* JADX INFO: renamed from: m */
    public boolean f50106m;

    /* JADX INFO: renamed from: n */
    public boolean f50107n;

    /* JADX INFO: renamed from: o */
    public boolean f50108o;

    /* JADX INFO: renamed from: p */
    public InterfaceC9852d0 f50109p;

    /* JADX INFO: renamed from: q */
    public int f50110q;

    /* JADX INFO: renamed from: r */
    public int f50111r;

    /* JADX INFO: renamed from: w9.c0$a */
    public class a implements InterfaceC9873x {

        /* JADX INFO: renamed from: a */
        public final C8739a f50112a = new C8739a(new byte[4], 4);

        public a() {
        }

        @Override // p453w9.InterfaceC9873x
        /* JADX INFO: renamed from: a */
        public final void mo18342a(C10151t c10151t) {
            C9850c0 c9850c0;
            if (c10151t.m19145t() == 0 && (c10151t.m19145t() & BuildConfig.SDK_TRUNCATE_LENGTH) != 0) {
                c10151t.m19125F(6);
                int i10 = (c10151t.f51440c - c10151t.f51439b) / 4;
                int i11 = 0;
                while (true) {
                    c9850c0 = C9850c0.this;
                    if (i11 >= i10) {
                        break;
                    }
                    C8739a c8739a = this.f50112a;
                    c10151t.m19127b((byte[]) c8739a.f46335d, 0, 4);
                    c8739a.m16974k(0);
                    int iM16970g = c8739a.m16970g(16);
                    c8739a.m16976m(3);
                    if (iM16970g == 0) {
                        c8739a.m16976m(13);
                    } else {
                        int iM16970g2 = c8739a.m16970g(13);
                        if (c9850c0.f50099f.get(iM16970g2) == null) {
                            c9850c0.f50099f.put(iM16970g2, new C9874y(c9850c0.new b(iM16970g2)));
                            c9850c0.f50105l++;
                        }
                    }
                    i11++;
                }
                if (c9850c0.f50094a != 2) {
                    c9850c0.f50099f.remove(0);
                }
            }
        }

        @Override // p453w9.InterfaceC9873x
        /* JADX INFO: renamed from: c */
        public final void mo18343c(C10130a0 c10130a0, InterfaceC7509j interfaceC7509j, InterfaceC9852d0.d dVar) {
        }
    }

    /* JADX INFO: renamed from: w9.c0$b */
    public class b implements InterfaceC9873x {

        /* JADX INFO: renamed from: a */
        public final C8739a f50114a = new C8739a(new byte[5], 5);

        /* JADX INFO: renamed from: b */
        public final SparseArray<InterfaceC9852d0> f50115b = new SparseArray<>();

        /* JADX INFO: renamed from: c */
        public final SparseIntArray f50116c = new SparseIntArray();

        /* JADX INFO: renamed from: d */
        public final int f50117d;

        public b(int i10) {
            this.f50117d = i10;
        }

        /* JADX WARN: Code duplicated, block: B:100:0x021e  */
        /* JADX WARN: Code duplicated, block: B:101:0x0221  */
        /* JADX WARN: Code duplicated, block: B:48:0x0135  */
        /* JADX WARN: Code duplicated, block: B:52:0x013f  */
        /* JADX WARN: Code duplicated, block: B:97:0x0211  */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x014e, code lost:
        
            if (r27.m19145t() == 21) goto L57;
         */
        @Override // p453w9.InterfaceC9873x
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void mo18342a(C10151t c10151t) {
            C10130a0 c10130a0;
            SparseBooleanArray sparseBooleanArray;
            SparseArray<InterfaceC9852d0> sparseArray;
            C10130a0 c10130a1;
            int i10;
            SparseArray<InterfaceC9852d0> sparseArray2;
            int i11;
            char c10;
            InterfaceC9852d0 interfaceC9852d0Mo18347a;
            SparseIntArray sparseIntArray;
            int i12;
            SparseArray<InterfaceC9852d0> sparseArray3;
            SparseIntArray sparseIntArray2;
            int i13;
            if (c10151t.m19145t() != 2) {
                return;
            }
            C9850c0 c9850c0 = C9850c0.this;
            int i14 = c9850c0.f50094a;
            int i15 = 0;
            List<C10130a0> list = c9850c0.f50095b;
            if (i14 == 1 || i14 == 2 || c9850c0.f50105l == 1) {
                c10130a0 = list.get(0);
            } else {
                c10130a0 = new C10130a0(list.get(0).m19005c());
                list.add(c10130a0);
            }
            if ((c10151t.m19145t() & BuildConfig.SDK_TRUNCATE_LENGTH) == 0) {
                return;
            }
            c10151t.m19125F(1);
            int iM19150y = c10151t.m19150y();
            int i16 = 3;
            c10151t.m19125F(3);
            C8739a c8739a = this.f50114a;
            c10151t.m19127b((byte[]) c8739a.f46335d, 0, 2);
            c8739a.m16974k(0);
            c8739a.m16976m(3);
            c9850c0.f50111r = c8739a.m16970g(13);
            c10151t.m19127b((byte[]) c8739a.f46335d, 0, 2);
            c8739a.m16974k(0);
            c8739a.m16976m(4);
            c10151t.m19125F(c8739a.m16970g(12));
            InterfaceC9852d0.c cVar = c9850c0.f50098e;
            int i17 = c9850c0.f50094a;
            if (i17 == 2 && c9850c0.f50109p == null) {
                InterfaceC9852d0 interfaceC9852d0Mo18347a2 = cVar.mo18347a(21, new InterfaceC9852d0.b(21, null, null, C10134c0.f51359f));
                c9850c0.f50109p = interfaceC9852d0Mo18347a2;
                if (interfaceC9852d0Mo18347a2 != null) {
                    interfaceC9852d0Mo18347a2.mo18346c(c10130a0, c9850c0.f50104k, new InterfaceC9852d0.d(iM19150y, 21, 8192));
                }
            }
            SparseArray<InterfaceC9852d0> sparseArray4 = this.f50115b;
            sparseArray4.clear();
            SparseIntArray sparseIntArray3 = this.f50116c;
            sparseIntArray3.clear();
            int i18 = c10151t.f51440c - c10151t.f51439b;
            while (true) {
                sparseBooleanArray = c9850c0.f50100g;
                if (i18 <= 0) {
                    break;
                }
                c10151t.m19127b((byte[]) c8739a.f46335d, i15, 5);
                c8739a.m16974k(i15);
                int iM16970g = c8739a.m16970g(8);
                c8739a.m16976m(i16);
                int iM16970g2 = c8739a.m16970g(13);
                c8739a.m16976m(4);
                int iM16970g3 = c8739a.m16970g(12);
                int i19 = c10151t.f51439b;
                int i20 = iM16970g3 + i19;
                C10130a0 c10130a2 = c10130a0;
                int i21 = iM19150y;
                C8739a c8739a2 = c8739a;
                String strTrim = null;
                ArrayList arrayList = null;
                int i22 = -1;
                while (true) {
                    if (c10151t.f51439b >= i20) {
                        sparseArray2 = sparseArray4;
                        i11 = iM16970g2;
                        break;
                    }
                    int iM19145t = c10151t.m19145t();
                    sparseArray2 = sparseArray4;
                    int iM19145t2 = c10151t.f51439b + c10151t.m19145t();
                    i11 = iM16970g2;
                    if (iM19145t2 > i20) {
                        break;
                    }
                    if (iM19145t == 5) {
                        long jM19146u = c10151t.m19146u();
                        if (jM19146u == 1094921523) {
                            i13 = 129;
                        } else if (jM19146u == 1161904947) {
                            i13 = 135;
                        } else if (jM19146u == 1094921524) {
                            i13 = 172;
                        } else {
                            if (jM19146u == 1212503619) {
                                i13 = 36;
                            }
                            sparseIntArray2 = sparseIntArray3;
                        }
                        i22 = i13;
                        sparseIntArray2 = sparseIntArray3;
                    } else {
                        if (iM19145t == 106) {
                            i13 = 129;
                        } else if (iM19145t == 122) {
                            i13 = 135;
                        } else {
                            if (iM19145t != 127) {
                                if (iM19145t == 123) {
                                    i13 = 138;
                                } else if (iM19145t == 10) {
                                    strTrim = c10151t.m19142q(3).trim();
                                } else if (iM19145t == 89) {
                                    arrayList = new ArrayList();
                                    while (c10151t.f51439b < iM19145t2) {
                                        String strTrim2 = c10151t.m19142q(3).trim();
                                        c10151t.m19145t();
                                        byte[] bArr = new byte[4];
                                        c10151t.m19127b(bArr, 0, 4);
                                        arrayList.add(new InterfaceC9852d0.a(strTrim2, bArr));
                                        sparseIntArray3 = sparseIntArray3;
                                    }
                                    sparseIntArray2 = sparseIntArray3;
                                    i22 = 89;
                                } else {
                                    sparseIntArray2 = sparseIntArray3;
                                    if (iM19145t == 111) {
                                        i22 = 257;
                                    }
                                }
                            }
                            sparseIntArray2 = sparseIntArray3;
                        }
                        i22 = i13;
                        sparseIntArray2 = sparseIntArray3;
                    }
                    c10151t.m19125F(iM19145t2 - c10151t.f51439b);
                    sparseIntArray3 = sparseIntArray2;
                    sparseArray4 = sparseArray2;
                    iM16970g2 = i11;
                }
                SparseIntArray sparseIntArray4 = sparseIntArray3;
                c10151t.m19124E(i20);
                InterfaceC9852d0.b bVar = new InterfaceC9852d0.b(i22, strTrim, arrayList, Arrays.copyOfRange(c10151t.f51438a, i19, i20));
                if (iM16970g == 6 || iM16970g == 5) {
                    iM16970g = i22;
                }
                i18 -= iM16970g3 + 5;
                int i23 = i17 == 2 ? iM16970g : i11;
                if (sparseBooleanArray.get(i23)) {
                    sparseIntArray = sparseIntArray4;
                    sparseArray3 = sparseArray2;
                    c10 = 21;
                } else {
                    if (i17 == 2) {
                        c10 = 21;
                        if (iM16970g == 21) {
                            interfaceC9852d0Mo18347a = c9850c0.f50109p;
                        }
                        if (i17 == 2) {
                            sparseIntArray = sparseIntArray4;
                            i12 = i11;
                            if (i12 < sparseIntArray.get(i23, 8192)) {
                                sparseArray3 = sparseArray2;
                            }
                        } else {
                            sparseIntArray = sparseIntArray4;
                            i12 = i11;
                        }
                        sparseIntArray.put(i23, i12);
                        sparseArray3 = sparseArray2;
                        sparseArray3.put(i23, interfaceC9852d0Mo18347a);
                    } else {
                        c10 = 21;
                    }
                    interfaceC9852d0Mo18347a = cVar.mo18347a(iM16970g, bVar);
                    if (i17 == 2) {
                        sparseIntArray = sparseIntArray4;
                        i12 = i11;
                        if (i12 < sparseIntArray.get(i23, 8192)) {
                            sparseArray3 = sparseArray2;
                        }
                    } else {
                        sparseIntArray = sparseIntArray4;
                        i12 = i11;
                    }
                    sparseIntArray.put(i23, i12);
                    sparseArray3 = sparseArray2;
                    sparseArray3.put(i23, interfaceC9852d0Mo18347a);
                }
                sparseArray4 = sparseArray3;
                i16 = 3;
                c8739a = c8739a2;
                c10130a0 = c10130a2;
                iM19150y = i21;
                i15 = 0;
                sparseIntArray3 = sparseIntArray;
            }
            C10130a0 c10130a3 = c10130a0;
            int i24 = iM19150y;
            SparseIntArray sparseIntArray5 = sparseIntArray3;
            SparseArray<InterfaceC9852d0> sparseArray5 = sparseArray4;
            int size = sparseIntArray5.size();
            int i25 = 0;
            while (true) {
                sparseArray = c9850c0.f50099f;
                if (i25 >= size) {
                    break;
                }
                int iKeyAt = sparseIntArray5.keyAt(i25);
                int iValueAt = sparseIntArray5.valueAt(i25);
                sparseBooleanArray.put(iKeyAt, true);
                c9850c0.f50101h.put(iValueAt, true);
                InterfaceC9852d0 interfaceC9852d0ValueAt = sparseArray5.valueAt(i25);
                if (interfaceC9852d0ValueAt != null) {
                    if (interfaceC9852d0ValueAt != c9850c0.f50109p) {
                        InterfaceC7509j interfaceC7509j = c9850c0.f50104k;
                        i10 = i24;
                        InterfaceC9852d0.d dVar = new InterfaceC9852d0.d(i10, iKeyAt, 8192);
                        c10130a1 = c10130a3;
                        interfaceC9852d0ValueAt.mo18346c(c10130a1, interfaceC7509j, dVar);
                    } else {
                        c10130a1 = c10130a3;
                        i10 = i24;
                    }
                    sparseArray.put(iValueAt, interfaceC9852d0ValueAt);
                } else {
                    c10130a1 = c10130a3;
                    i10 = i24;
                }
                i25++;
                c10130a3 = c10130a1;
                i24 = i10;
            }
            if (i17 == 2) {
                if (!c9850c0.f50106m) {
                    c9850c0.f50104k.mo7365i();
                    c9850c0.f50105l = 0;
                    c9850c0.f50106m = true;
                }
                return;
            }
            sparseArray.remove(this.f50117d);
            int i26 = i17 == 1 ? 0 : c9850c0.f50105l - 1;
            c9850c0.f50105l = i26;
            if (i26 == 0) {
                c9850c0.f50104k.mo7365i();
                c9850c0.f50106m = true;
            }
        }

        @Override // p453w9.InterfaceC9873x
        /* JADX INFO: renamed from: c */
        public final void mo18343c(C10130a0 c10130a0, InterfaceC7509j interfaceC7509j, InterfaceC9852d0.d dVar) {
        }
    }

    public C9850c0(int i10, C10130a0 c10130a0, C9856g c9856g) {
        this.f50098e = c9856g;
        this.f50094a = i10;
        if (i10 == 1 || i10 == 2) {
            this.f50095b = Collections.singletonList(c10130a0);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f50095b = arrayList;
            arrayList.add(c10130a0);
        }
        this.f50096c = new C10151t(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f50100g = sparseBooleanArray;
        this.f50101h = new SparseBooleanArray();
        SparseArray<InterfaceC9852d0> sparseArray = new SparseArray<>();
        this.f50099f = sparseArray;
        this.f50097d = new SparseIntArray();
        this.f50102i = new C9848b0();
        this.f50104k = InterfaceC7509j.f41490A;
        this.f50111r = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i11 = 0; i11 < size; i11++) {
            sparseArray.put(sparseArray2.keyAt(i11), (InterfaceC9852d0) sparseArray2.valueAt(i11));
        }
        sparseArray.put(0, new C9874y(new a()));
        this.f50109p = null;
    }

    /* JADX WARN: Failed to calculate best type for var: r21v0 'this'  ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r21v0 'this'  ??, new type: w9.c0
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryToFixIncompatiblePrimitives(FixTypesVisitor.java:820)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r21v0 'this'  ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r21v0 'this'  ??, new type: w9.c0
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to set immutable type for var: r21v0 'this'  ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r21v0 'this'  ??, new type: w9.c0
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryToFixIncompatiblePrimitives(FixTypesVisitor.java:820)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to set immutable type for var: r21v0 'this'  ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r21v0 'this'  ??, new type: w9.c0
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r21v0, types: [w9.c0] */
    /* JADX WARN: Type inference failed for: r2v12, types: [int] */
    /* JADX WARN: Type inference failed for: r2v15, types: [int] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11, types: [android.util.SparseBooleanArray] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    @Override // p261m9.InterfaceC7507h
    /* JADX INFO: renamed from: d */
    public final int mo12865d(InterfaceC7508i interfaceC7508i, C7519t c7519t) throws IOException {
        C7504e c7504e;
        ?? r10;
        int i10;
        ?? r15;
        ?? r11;
        int i11;
        long j10;
        long j11;
        ?? r12;
        C7504e c7504e2 = (C7504e) interfaceC7508i;
        long j12 = c7504e2.f41476c;
        boolean z10 = this.f50106m;
        int i12 = this.f50094a;
        if (z10) {
            ?? r13 = (j12 == -1 || i12 == 2) ? false : true;
            C9848b0 c9848b0 = this.f50102i;
            if (r13 == true && !c9848b0.f50085d) {
                int i13 = this.f50111r;
                if (i13 <= 0) {
                    c9848b0.m18341a(c7504e2);
                    return 0;
                }
                boolean z11 = c9848b0.f50087f;
                C10151t c10151t = c9848b0.f50084c;
                int i14 = c9848b0.f50082a;
                if (!z11) {
                    int iMin = (int) Math.min(i14, j12);
                    long j13 = j12 - ((long) iMin);
                    if (c7504e2.f41477d == j13) {
                        c10151t.m19121B(iMin);
                        c7504e2.f41479f = 0;
                        c7504e2.mo14994c(c10151t.f51438a, 0, iMin, false);
                        int i15 = c10151t.f51439b;
                        int i16 = c10151t.f51440c;
                        for (int i17 = i16 - 188; i17 >= i15; i17--) {
                            byte[] bArr = c10151t.f51438a;
                            int i18 = -4;
                            int i19 = 0;
                            while (true) {
                                if (i18 > 4) {
                                    r12 = false;
                                    break;
                                }
                                int i20 = (i18 * 188) + i17;
                                if (i20 >= i15 && i20 < i16 && bArr[i20] == 71) {
                                    i19++;
                                    if (i19 == 5) {
                                        r12 = true;
                                        break;
                                    }
                                } else {
                                    i19 = 0;
                                }
                                i18++;
                            }
                            if (r12 != false) {
                                long jM16700T0 = C8573r0.m16700T0(i17, i13, c10151t);
                                if (jM16700T0 != -9223372036854775807L) {
                                    j11 = jM16700T0;
                                    c9848b0.f50089h = j11;
                                    c9848b0.f50087f = true;
                                    return 0;
                                }
                            }
                        }
                        j11 = -9223372036854775807L;
                        c9848b0.f50089h = j11;
                        c9848b0.f50087f = true;
                        return 0;
                    }
                    c7519t.f41516a = j13;
                } else {
                    if (c9848b0.f50089h == -9223372036854775807L) {
                        c9848b0.m18341a(c7504e2);
                        return 0;
                    }
                    if (c9848b0.f50086e) {
                        long j14 = c9848b0.f50088g;
                        if (j14 == -9223372036854775807L) {
                            c9848b0.m18341a(c7504e2);
                            return 0;
                        }
                        C10130a0 c10130a0 = c9848b0.f50083b;
                        long jM19004b = c10130a0.m19004b(c9848b0.f50089h) - c10130a0.m19004b(j14);
                        c9848b0.f50090i = jM19004b;
                        if (jM19004b < 0) {
                            C10145n.m19099g("TsDurationReader", "Invalid duration: " + c9848b0.f50090i + ". Using TIME_UNSET instead.");
                            c9848b0.f50090i = -9223372036854775807L;
                        }
                        c9848b0.m18341a(c7504e2);
                        return 0;
                    }
                    int iMin2 = (int) Math.min(i14, j12);
                    long j15 = 0;
                    if (c7504e2.f41477d == j15) {
                        c10151t.m19121B(iMin2);
                        c7504e2.f41479f = 0;
                        c7504e2.mo14994c(c10151t.f51438a, 0, iMin2, false);
                        int i21 = c10151t.f51440c;
                        for (int i22 = c10151t.f51439b; i22 < i21; i22++) {
                            if (c10151t.f51438a[i22] == 71) {
                                long jM16700T1 = C8573r0.m16700T0(i22, i13, c10151t);
                                if (jM16700T1 != -9223372036854775807L) {
                                    j10 = jM16700T1;
                                    c9848b0.f50088g = j10;
                                    c9848b0.f50086e = true;
                                    return 0;
                                }
                            }
                        }
                        j10 = -9223372036854775807L;
                        c9848b0.f50088g = j10;
                        c9848b0.f50086e = true;
                        return 0;
                    }
                    c7519t.f41516a = j15;
                }
                return 1;
            }
            if (this.f50107n) {
                r10 = 1;
                i10 = i12;
                r15 = 0;
            } else {
                this.f50107n = true;
                long j16 = c9848b0.f50090i;
                if (j16 != -9223372036854775807L) {
                    r15 = 0;
                    C9846a0 c9846a0 = new C9846a0(c9848b0.f50083b, j16, j12, this.f50111r, 112800);
                    this.f50103j = c9846a0;
                    this.f50104k.mo7364c(c9846a0.f41438a);
                    r10 = 1;
                    i10 = i12;
                } else {
                    r10 = 1;
                    i10 = i12;
                    r15 = 0;
                    this.f50104k.mo7364c(new InterfaceC7520u.b(j16));
                }
            }
            if (this.f50108o) {
                this.f50108o = r15;
                mo12866e(r5, r5);
                c7504e = c7504e2;
                if (c7504e.f41477d != r5) {
                    c7519t.f41516a = 0L;
                    return r10 == true ? 1 : 0;
                }
            } else {
                c7504e = c7504e2;
            }
            C9846a0 c9846a1 = this.f50103j;
            if (c9846a1 != null) {
                if ((c9846a1.f41440c != null ? r10 == true ? 1 : 0 : r15 == true ? 1 : 0) != 0) {
                    return c9846a1.m14980a(c7504e, c7519t);
                }
            }
        } else {
            c7504e = c7504e2;
            r10 = 1;
            i10 = i12;
            r15 = 0;
        }
        C10151t c10151t2 = this.f50096c;
        byte[] bArr2 = c10151t2.f51438a;
        int i23 = c10151t2.f51439b;
        if (9400 - i23 < 188) {
            int i24 = c10151t2.f51440c - i23;
            if (i24 > 0) {
                System.arraycopy(bArr2, i23, bArr2, r15, i24);
            }
            c10151t2.m19122C(bArr2, i24);
        }
        while (true) {
            int i25 = c10151t2.f51440c;
            if (i25 - c10151t2.f51439b >= 188) {
                r11 = r10;
                break;
            }
            int i26 = c7504e.read(bArr2, i25, 9400 - i25);
            if (i26 == -1) {
                r11 = r15;
                break;
            }
            c10151t2.m19123D(i25 + i26);
        }
        if (r11 == 0) {
            return -1;
        }
        int i27 = c10151t2.f51439b;
        int i28 = c10151t2.f51440c;
        byte[] bArr3 = c10151t2.f51438a;
        int i29 = i27;
        while (i29 < i28 && bArr3[i29] != 71) {
            i29++;
        }
        c10151t2.m19124E(i29);
        int i30 = i29 + 188;
        if (i30 > i28) {
            int i31 = (i29 - i27) + this.f50110q;
            this.f50110q = i31;
            i11 = 2;
            if (i10 == 2 && i31 > 376) {
                throw ParserException.m6770a("Cannot find sync byte. Most likely not a Transport Stream.", null);
            }
        } else {
            i11 = 2;
            this.f50110q = r15;
        }
        int i32 = c10151t2.f51440c;
        if (i30 > i32) {
            return r15;
        }
        int iM19129d = c10151t2.m19129d();
        if ((8388608 & iM19129d) != 0) {
            c10151t2.m19124E(i30);
            return r15;
        }
        int i33 = ((4194304 & iM19129d) != 0 ? r10 : r15) | r15;
        int i34 = (2096896 & iM19129d) >> 8;
        ?? r14 = (iM19129d & 32) != 0 ? r10 : r15;
        InterfaceC9852d0 interfaceC9852d0 = ((iM19129d & 16) != 0 ? r10 : r15) != 0 ? this.f50099f.get(i34) : null;
        if (interfaceC9852d0 == null) {
            c10151t2.m19124E(i30);
            return r15;
        }
        if (i10 != i11) {
            int i35 = iM19129d & 15;
            SparseIntArray sparseIntArray = this.f50097d;
            int i36 = sparseIntArray.get(i34, i35 - 1);
            sparseIntArray.put(i34, i35);
            if (i36 == i35) {
                c10151t2.m19124E(i30);
                return r15;
            }
            if (i35 != ((i36 + r10) & 15)) {
                interfaceC9852d0.mo18345b();
            }
        }
        if (r14 != 0) {
            int iM19145t = c10151t2.m19145t();
            i33 |= (c10151t2.m19145t() & 64) != 0 ? 2 : r15;
            c10151t2.m19125F(iM19145t - r10);
        }
        boolean z12 = this.f50106m;
        if (((i10 == 2 || z12 || !this.f50101h.get(i34, r15)) ? r10 : r15) != 0) {
            c10151t2.m19123D(i30);
            interfaceC9852d0.mo18344a(i33, c10151t2);
            c10151t2.m19123D(i32);
        }
        if (i10 != 2 && !z12 && this.f50106m && j12 != -1) {
            this.f50108o = r10;
        }
        c10151t2.m19124E(i30);
        return r15;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p261m9.InterfaceC7507h
    /* JADX INFO: renamed from: e */
    public final void mo12866e(long j10, long j11) {
        C9846a0 c9846a0;
        long j12;
        C10129a.m18992d(this.f50094a != 2);
        List<C10130a0> list = this.f50095b;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            C10130a0 c10130a0 = list.get(i10);
            synchronized (c10130a0) {
                j12 = c10130a0.f51350b;
            }
            boolean z10 = j12 == -9223372036854775807L;
            if (!z10) {
                long jM19005c = c10130a0.m19005c();
                if (jM19005c == -9223372036854775807L || jM19005c == 0 || jM19005c == j11) {
                    z10 = false;
                } else {
                    z10 = true;
                }
            }
            if (z10) {
                c10130a0.m19006d(j11);
            }
        }
        if (j11 != 0 && (c9846a0 = this.f50103j) != null) {
            c9846a0.m14981c(j11);
        }
        this.f50096c.m19121B(0);
        this.f50097d.clear();
        int i11 = 0;
        while (true) {
            SparseArray<InterfaceC9852d0> sparseArray = this.f50099f;
            if (i11 >= sparseArray.size()) {
                this.f50110q = 0;
                return;
            } else {
                sparseArray.valueAt(i11).mo18345b();
                i11++;
            }
        }
    }

    @Override // p261m9.InterfaceC7507h
    /* JADX INFO: renamed from: f */
    public final void mo12867f(InterfaceC7509j interfaceC7509j) {
        this.f50104k = interfaceC7509j;
    }

    @Override // p261m9.InterfaceC7507h
    /* JADX INFO: renamed from: g */
    public final boolean mo12868g(InterfaceC7508i interfaceC7508i) throws IOException {
        boolean z10;
        byte[] bArr = this.f50096c.f51438a;
        C7504e c7504e = (C7504e) interfaceC7508i;
        c7504e.mo14994c(bArr, 0, 940, false);
        for (int i10 = 0; i10 < 188; i10++) {
            int i11 = 0;
            while (true) {
                if (i11 >= 5) {
                    z10 = true;
                    break;
                }
                if (bArr[(i11 * 188) + i10] != 71) {
                    z10 = false;
                    break;
                }
                i11++;
            }
            if (z10) {
                c7504e.mo14998j(i10);
                return true;
            }
        }
        return false;
    }

    @Override // p261m9.InterfaceC7507h
    public final void release() {
    }
}
