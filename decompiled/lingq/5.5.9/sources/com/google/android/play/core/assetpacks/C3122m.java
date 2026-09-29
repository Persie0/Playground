package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import p290o6.C7967l0;
import p338qd.C8550j1;
import p338qd.C8558m0;
import p338qd.InterfaceC8589w1;
import td.C9265m;
import td.InterfaceC9268p;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.m */
/* JADX INFO: loaded from: classes.dex */
public final class C3122m {

    /* JADX INFO: renamed from: c */
    public static final C7967l0 f15954c = new C7967l0("PatchSliceTaskHandler");

    /* JADX INFO: renamed from: a */
    public final C3112c f15955a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC9268p f15956b;

    public C3122m(C3112c c3112c, InterfaceC9268p interfaceC9268p) {
        this.f15955a = c3112c;
        this.f15956b = interfaceC9268p;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: a */
    public final void m8997a(C8550j1 c8550j1) {
        C7967l0 c7967l0 = f15954c;
        Object obj = c8550j1.f33657b;
        C3112c c3112c = this.f15955a;
        int i10 = c8550j1.f45889c;
        long j10 = c8550j1.f45890d;
        File fileM8974j = c3112c.m8974j((String) obj, i10, j10);
        String str = (String) obj;
        File file = new File(c3112c.m8974j(str, i10, j10), "_metadata");
        String str2 = c8550j1.f45894h;
        File file2 = new File(file, str2);
        try {
            int i11 = c8550j1.f45893g;
            InputStream inputStream = c8550j1.f45896j;
            InputStream gZIPInputStream = i11 != 2 ? inputStream : new GZIPInputStream(inputStream, 8192);
            try {
                C3113d c3113d = new C3113d(fileM8974j, file2);
                File fileM8975k = this.f15955a.m8975k((String) obj, c8550j1.f45891e, c8550j1.f45892f, c8550j1.f45894h);
                if (!fileM8975k.exists()) {
                    fileM8975k.mkdirs();
                }
                C3124o c3124o = new C3124o(this.f15955a, (String) obj, c8550j1.f45891e, c8550j1.f45892f, c8550j1.f45894h);
                C9265m.m17626a(c3113d, gZIPInputStream, new C8558m0(fileM8975k, c3124o), c8550j1.f45895i);
                c3124o.m9005g(0);
                gZIPInputStream.close();
                c7967l0.m15814o("Patching and extraction finished for slice %s of pack %s.", str2, str);
                ((InterfaceC8589w1) this.f15956b.zza()).mo8959e(str, c8550j1.f33656a, 0, str2);
                try {
                    inputStream.close();
                } catch (IOException unused) {
                    c7967l0.m15815p("Could not close file for slice %s of pack %s.", str2, str);
                }
            } catch (Throwable th2) {
                try {
                    gZIPInputStream.close();
                } catch (Throwable unused2) {
                }
                throw th2;
            }
        } catch (IOException e10) {
            c7967l0.m15812m("IOException during patching %s.", e10.getMessage());
            throw new zzck(String.format("Error patching slice %s of pack %s.", str2, str), e10, c8550j1.f33656a);
        }
    }
}
