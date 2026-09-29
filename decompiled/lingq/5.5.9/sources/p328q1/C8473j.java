package p328q1;

import android.graphics.Typeface;
import android.os.Build;
import dm.C5207g;

/* JADX INFO: renamed from: q1.j */
/* JADX INFO: loaded from: classes.dex */
public final class C8473j {
    /* JADX WARN: Code duplicated, block: B:18:0x0033  */
    /* JADX WARN: Code duplicated, block: B:27:0x0058  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:44:0x0079  */
    /* JADX WARN: Code duplicated, block: B:45:0x007c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0080  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:55:0x0093  */
    /* JADX WARN: Code duplicated, block: B:57:0x0096  */
    /* JADX WARN: Code duplicated, block: B:59:0x0099  */
    /* JADX WARN: Code duplicated, block: B:60:0x009b  */
    /* JADX WARN: Code duplicated, block: B:62:0x009e  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:68:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x00af  */
    /* JADX WARN: Code duplicated, block: B:73:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:75:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:77:0x00be  */
    /* JADX WARN: Code duplicated, block: B:78:0x00c2  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: a */
    public static final Object m16548a(int i10, Object obj, InterfaceC8468e interfaceC8468e, C8476m c8476m, int i11) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i12;
        boolean z14;
        Typeface typefaceM16554a;
        boolean z15;
        ?? r10;
        boolean z16;
        boolean z17;
        C5207g.m11111f(obj, "typeface");
        C5207g.m11111f(interfaceC8468e, "font");
        C5207g.m11111f(c8476m, "requestedWeight");
        if (!(obj instanceof Typeface)) {
            return obj;
        }
        boolean z18 = true;
        if (i10 == 1) {
            z10 = true;
        } else {
            if (i10 == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        if (!z10 || C5207g.m11106a(interfaceC8468e.mo16544b(), c8476m)) {
            z11 = false;
        } else {
            C8476m c8476m2 = C8476m.f45648d;
            if (c8476m.compareTo(c8476m2) < 0 || interfaceC8468e.mo16544b().compareTo(c8476m2) >= 0) {
                z11 = false;
            } else {
                z11 = true;
            }
        }
        if (!(i10 == 1)) {
            if (!(i10 == 3)) {
                z12 = false;
            }
            if (z12) {
                if (i11 == interfaceC8468e.mo16545c()) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (z17) {
                    z13 = false;
                } else {
                    z13 = true;
                }
            } else {
                z13 = false;
            }
            if (z13 && !z11) {
                return obj;
            }
            if (Build.VERSION.SDK_INT < 28) {
                if (z13) {
                    if (i11 == 1) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (z16) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                } else {
                    z15 = false;
                }
                if (z15 || !z11) {
                    r10 = z18;
                    if (!z11) {
                        if (z15) {
                            r10 = 2;
                        } else {
                            r10 = 0;
                        }
                    }
                } else {
                    r10 = 3;
                }
                typefaceM16554a = Typeface.create((Typeface) obj, (int) r10);
            } else {
                if (z11) {
                    i12 = c8476m.f45655a;
                } else {
                    i12 = interfaceC8468e.mo16544b().f45655a;
                }
                if (z13 ? interfaceC8468e.mo16545c() != 1 : i11 != 1) {
                    z14 = z18;
                    z14 = z18;
                    z14 = false;
                }
                z14 = z18;
                z14 = z18;
                typefaceM16554a = C8485v.f45665a.m16554a((Typeface) obj, i12, z14);
            }
            C5207g.m11110e(typefaceM16554a, "if (Build.VERSION.SDK_IN…ht, finalFontStyle)\n    }");
            return typefaceM16554a;
        }
        z12 = true;
        if (z12) {
            z13 = false;
        } else {
            if (i11 == interfaceC8468e.mo16545c()) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (z17) {
                z13 = true;
            } else {
                z13 = false;
            }
        }
        if (z13) {
        }
        if (Build.VERSION.SDK_INT < 28) {
            if (z13) {
                z15 = false;
            } else {
                if (i11 == 1) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (z16) {
                    z15 = true;
                } else {
                    z15 = false;
                }
            }
            if (z15) {
                r10 = z18;
                if (!z11) {
                    if (z15) {
                        r10 = 2;
                    } else {
                        r10 = 0;
                    }
                }
            } else {
                r10 = z18;
                if (!z11) {
                    if (z15) {
                        r10 = 2;
                    } else {
                        r10 = 0;
                    }
                }
            }
            typefaceM16554a = Typeface.create((Typeface) obj, (int) r10);
        } else {
            if (z11) {
                i12 = c8476m.f45655a;
            } else {
                i12 = interfaceC8468e.mo16544b().f45655a;
            }
            if (z13) {
                z14 = z18;
                z14 = z18;
                z14 = false;
            } else {
                z14 = z18;
                z14 = z18;
                z14 = false;
            }
            z14 = z18;
            z14 = z18;
            typefaceM16554a = C8485v.f45665a.m16554a((Typeface) obj, i12, z14);
        }
        C5207g.m11110e(typefaceM16554a, "if (Build.VERSION.SDK_IN…ht, finalFontStyle)\n    }");
        return typefaceM16554a;
    }
}
