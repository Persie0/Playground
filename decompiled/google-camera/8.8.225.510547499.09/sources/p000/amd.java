package p000;

import android.os.Looper;
import android.util.Log;
import androidx.work.impl.workers.NHKG.pIeXJQLZLfgIN;
import com.google.android.material.snackbar.VMX.rgoX;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class amd {

    /* JADX INFO: renamed from: a */
    public final amh f681a;

    /* JADX INFO: renamed from: b */
    private final akv f682b;

    public amd() {
    }

    /* JADX INFO: renamed from: a */
    public static amd m936a(akv akvVar) {
        return new amd(akvVar, ((alw) akvVar).getViewModelStore$ar$class_merging$ar$class_merging(), null, null);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m937b(int i) {
        return Log.isLoggable("LoaderManager", i);
    }

    /* JADX INFO: renamed from: c */
    public final void m938c(int i, amc amcVar) {
        if (this.f681a.f693c) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        ame ameVarM943a = this.f681a.m943a(i);
        if (m937b(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("initLoader in ");
            sb.append(this);
            sb.append(": args=");
            sb.append((Object) null);
        }
        if (ameVarM943a != null) {
            if (m937b(3)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("  Re-using existing loader ");
                sb2.append(ameVarM943a);
            }
            ameVarM943a.m942k(this.f682b, amcVar);
            return;
        }
        try {
            this.f681a.f693c = true;
            amk amkVarMo933a = amcVar.mo933a();
            if (amkVarMo933a.getClass().isMemberClass() && !Modifier.isStatic(amkVarMo933a.getClass().getModifiers())) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + amkVarMo933a);
            }
            ame ameVar = new ame(i, amkVarMo933a);
            if (m937b(3)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("  Created new loader ");
                sb3.append(ameVar);
            }
            this.f681a.f692b.m19565d(i, ameVar);
            this.f681a.m944b();
            ameVar.m942k(this.f682b, amcVar);
        } catch (Throwable th) {
            this.f681a.m944b();
            throw th;
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public final void m939d(String str, PrintWriter printWriter) {
        amh amhVar = this.f681a;
        if (amhVar.f692b.m19563b() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String strValueOf = String.valueOf(str);
            for (int i = 0; i < amhVar.f692b.m19563b(); i++) {
                String strConcat = strValueOf.concat("    ");
                ame ameVar = (ame) amhVar.f692b.m19564c(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(amhVar.f692b.m19562a(i));
                printWriter.print(": ");
                printWriter.println(ameVar.toString());
                printWriter.print(strConcat);
                printWriter.print("mId=");
                printWriter.print(ameVar.f683j);
                printWriter.print(" mArgs=");
                printWriter.println((Object) null);
                printWriter.print(strConcat);
                printWriter.print(rgoX.xnq);
                printWriter.println(ameVar.f684k);
                ameVar.f684k.mo952e(strConcat.concat("  "), printWriter);
                if (ameVar.f685l != null) {
                    printWriter.print(strConcat);
                    printWriter.print("mCallbacks=");
                    printWriter.println(ameVar.f685l);
                    amf amfVar = ameVar.f685l;
                    printWriter.print(strConcat.concat("  "));
                    printWriter.print(pIeXJQLZLfgIN.FJEHSwRwJO);
                    printWriter.println(amfVar.f689c);
                }
                printWriter.print(strConcat);
                printWriter.print("mData=");
                amk amkVar = ameVar.f684k;
                Object obj = ameVar.f628f;
                printWriter.println(amk.m954j(obj != alc.f623a ? obj : null));
                printWriter.print(strConcat);
                printWriter.print("mStarted=");
                printWriter.println(ameVar.f626d > 0);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        sb.append(this.f682b.getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this.f682b)));
        sb.append("}}");
        return sb.toString();
    }

    public amd(akv akvVar, bkn bknVar, byte[] bArr, byte[] bArr2) {
        this.f682b = akvVar;
        alt altVar = amh.f691a;
        bknVar.getClass();
        alx alxVar = alx.f669a;
        alxVar.getClass();
        this.f681a = (amh) ach.m190c(amh.class, bknVar, altVar, alxVar);
    }
}
