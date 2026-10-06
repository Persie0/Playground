package p000;

import com.google.android.libraries.vision.opengl.MUg.WIxTIdUIdfb;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lov {

    /* JADX INFO: renamed from: e */
    private final msi f38854e;

    /* JADX INFO: renamed from: d */
    private static final msa f38853d = msa.m16846b('/').m16848a();

    /* JADX INFO: renamed from: a */
    public static final lou f38850a = new lot(1);

    /* JADX INFO: renamed from: b */
    public static final lou f38851b = new lot(0);

    /* JADX INFO: renamed from: c */
    public static final lou f38852c = new lot(2);

    public lov() {
        ffw ffwVar = ffw.f21764j;
        throw null;
    }

    public lov(msi msiVar) {
        this.f38854e = msiVar;
    }

    /* JADX INFO: renamed from: b */
    public static List m15789b(String str) {
        return mkv.m16504L(f38853d.m16851f(str), hnk.f28506s);
    }

    /* JADX INFO: renamed from: c */
    public static void m15790c(lou louVar, nyv nyvVar) {
        String strMo15785a = louVar.mo15785a(nyvVar);
        String strMo15786b = louVar.mo15786b(nyvVar);
        if (!strMo15785a.isEmpty() || strMo15786b.isEmpty()) {
            louVar.mo15787c(nyvVar, null);
        } else {
            louVar.mo15787c(nyvVar, nqp.m17625a(strMo15786b));
        }
        louVar.mo15788d(nyvVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:43:0x0097  */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00e0, code lost:
    
        if (r0.equals("Attempt to do a synchronize operation on a null object") == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x010a, code lost:
    
        if (java.util.regex.Pattern.matches("Conflicting default method implementations .+", r0) == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0142, code lost:
    
        if (java.util.regex.Pattern.matches("Method '.+' implementing interface method '.+' is not public", r0) == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x016b, code lost:
    
        if (r1 != false) goto L93;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final nms m15791a(nms nmsVar) {
        boolean zStartsWith;
        String str = nmsVar.f43895c;
        if (str.isEmpty()) {
            return nmsVar;
        }
        if (((Boolean) this.f38854e.mo6051a()).booleanValue()) {
            switch (nmsVar.f43894b) {
                case "java.lang.AbstractMethodError":
                    zStartsWith = str.startsWith("abstract method ");
                    break;
                case "java.lang.ArithmeticException":
                    zStartsWith = str.equals(WIxTIdUIdfb.QoCu);
                    break;
                case "java.lang.ArrayIndexOutOfBoundsException":
                    zStartsWith = Pattern.matches("length=\\d+; index=-?\\d+", str);
                    break;
                case "java.lang.ArrayStoreException":
                    zStartsWith = Pattern.matches(".+ cannot be stored in an array of type .+", str);
                    break;
                case "java.lang.ClassCastException":
                    zStartsWith = Pattern.matches(".+ cannot be cast to .+", str);
                    break;
                case "java.lang.IllegalAccessError":
                    if (!Pattern.matches("Illegal class access: '.+' attempting to access .+'", str)) {
                        if (!Pattern.matches("Illegal class access ('.+' attempting to access '.+') in attempt to invoke .+ method .+", str)) {
                            if (!Pattern.matches("Illegal class access ('.+' attempting to access '.+') in attempt to invoke .+ method .+", str)) {
                                if (!Pattern.matches("Method '.+' is inaccessible to class '.+'", str)) {
                                    if (!Pattern.matches("Field '.+' is inaccessible to class '.+'", str)) {
                                        if (!Pattern.matches("Final field '.+' cannot be written to by method '.+'", str)) {
                                        }
                                    }
                                }
                            }
                        }
                        break;
                    }
                    return nmsVar;
                case "java.lang.IncompatibleClassChangeError":
                    if (!Pattern.matches("The method '.+' was expected to be of type .+ but instead was found to be of type .+", str)) {
                        if (!Pattern.matches("Class '.+' does not implement interface '.+' in call to '.+'", str)) {
                            if (!Pattern.matches("Expected '.+' to be a (?:static|instance) field rather than a (?:static|instance) field", str)) {
                            }
                        }
                        break;
                    }
                    return nmsVar;
                case "java.lang.IndexOutOfBoundsException":
                    zStartsWith = Pattern.matches("length=\\d+; index=-?\\d+", str);
                    break;
                case "java.lang.NullPointerException":
                    if (!Pattern.matches("Attempt to (?:read to|write from) field '.+' on a null object reference in method '.+'", str)) {
                        if (!Pattern.matches("Attempt to invoke .+ method '.+' on a null object reference", str)) {
                            if (!str.equals("Attempt to read from null array")) {
                                if (!str.equals("Attempt to write to null array")) {
                                    if (!str.equals("Attempt to get length of null array")) {
                                    }
                                }
                            }
                        }
                        break;
                    }
                    return nmsVar;
                case "java.lang.StringIndexOutOfBoundsException":
                    zStartsWith = Pattern.matches("length=\\d+; index=\\d+", str);
                    break;
                case "java.lang.WrongMethodTypeException":
                    zStartsWith = Pattern.matches("Expected .+ but was .+", str);
                    break;
            }
        }
        nxl nxlVar = (nxl) nmsVar.m18143ad(5);
        nxlVar.m18108s(nmsVar);
        long jLongValue = nqp.m17625a(str).longValue();
        if (!nxlVar.f44974b.m18142ac()) {
            nxlVar.mo18106p();
        }
        nxq nxqVar = nxlVar.f44974b;
        nms nmsVar2 = (nms) nxqVar;
        nmsVar2.f43893a = 4 | nmsVar2.f43893a;
        nmsVar2.f43896d = jLongValue;
        if (!nxqVar.m18142ac()) {
            nxlVar.mo18106p();
        }
        nms nmsVar3 = (nms) nxlVar.f44974b;
        nmsVar3.f43893a &= -3;
        nmsVar3.f43895c = nms.f43891f.f43895c;
        return (nms) nxlVar.mo18103l();
    }
}
