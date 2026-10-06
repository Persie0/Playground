package p000;

import android.content.Context;
import android.provider.MediaStore;
import com.google.android.material.snackbar.VMX.rgoX;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import p021j$.util.DesugarTimeZone;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hlz implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f28291a;

    public hlz(oju ojuVar) {
        this.f28291a = ojuVar;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final kqv get() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        mxk mxkVar;
        DateFormat dateFormat;
        Context context;
        String str7;
        String str8;
        String str9;
        krj krjVar;
        Context contextM6830a = ((dws) this.f28291a).m6830a();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd_HHmmssSSS", Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        kqu kquVar = new kqu();
        kquVar.f36936a = "IMG_";
        kquVar.f36937b = "IMG_";
        kquVar.f36938c = "VID_";
        kquVar.f36939d = "_tmp.";
        kquVar.m14727d();
        kquVar.m14725b();
        kquVar.m14724a(4);
        kquVar.m14728e(false);
        kquVar.m14729f(false);
        kquVar.m14726c(mzx.f41874a);
        kquVar.f36946k = simpleDateFormat;
        kquVar.m14731h();
        kquVar.f36950o = "";
        kquVar.m14732i();
        kquVar.m14730g();
        kquVar.f36953r = true;
        kquVar.f36955t = (byte) (kquVar.f36955t | 24);
        kquVar.f36948m = contextM6830a;
        kquVar.f36936a = "PXL_";
        kquVar.f36937b = "PXL_";
        kquVar.f36938c = "PXL_";
        kquVar.f36939d = "_PXL_";
        kquVar.m14727d();
        kquVar.m14725b();
        kquVar.m14724a(2);
        kquVar.m14726c(mxk.m17136H("dng"));
        kquVar.m14728e(true);
        kquVar.m14729f(true);
        kquVar.m14731h();
        kquVar.f36950o = "media";
        kquVar.m14732i();
        kquVar.m14730g();
        Context context2 = kquVar.f36948m;
        if (context2 == null) {
            throw new IllegalStateException("Property \"storageContext\" has not been set");
        }
        kri kriVarM14759a = krj.m14759a(context2);
        kriVarM14759a.m14757g(MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        kriVarM14759a.m14758h(MediaStore.Video.Media.EXTERNAL_CONTENT_URI);
        kriVarM14759a.f37040c = "_display_name";
        kriVarM14759a.m14756f();
        kriVarM14759a.m14752b();
        kriVarM14759a.f37042e = "relative_path";
        kriVarM14759a.m14753c();
        kriVarM14759a.m14754d(1);
        kriVarM14759a.m14755e(3);
        kquVar.f36952q = kriVarM14759a.m14751a();
        if (kquVar.f36947l == null) {
            kquVar.f36947l = mzw.f41870a;
        }
        if (kquVar.f36955t == 63 && (str = kquVar.f36936a) != null && (str2 = kquVar.f36937b) != null && (str3 = kquVar.f36938c) != null && (str4 = kquVar.f36939d) != null && (str5 = kquVar.f36940e) != null && (str6 = kquVar.f36941f) != null && (mxkVar = kquVar.f36945j) != null && (dateFormat = kquVar.f36946k) != null && (context = kquVar.f36948m) != null && (str7 = kquVar.f36949n) != null && (str8 = kquVar.f36950o) != null && (str9 = kquVar.f36951p) != null && (krjVar = kquVar.f36952q) != null) {
            return new kqv(str, str2, str3, str4, str5, str6, kquVar.f36942g, kquVar.f36943h, kquVar.f36944i, mxkVar, dateFormat, kquVar.f36947l, context, str7, str8, str9, krjVar, kquVar.f36953r, kquVar.f36954s);
        }
        StringBuilder sb = new StringBuilder();
        if (kquVar.f36936a == null) {
            sb.append(" filenameDefaultPrefix");
        }
        if (kquVar.f36937b == null) {
            sb.append(" filenameImagePrefix");
        }
        if (kquVar.f36938c == null) {
            sb.append(" filenameVideoPrefix");
        }
        if (kquVar.f36939d == null) {
            sb.append(" filenameTmpPrefix");
        }
        if (kquVar.f36940e == null) {
            sb.append(" filenameBurstTagPrefix");
        }
        if (kquVar.f36941f == null) {
            sb.append(" filenameBurstPrimaryTag");
        }
        if ((kquVar.f36955t & 1) == 0) {
            sb.append(" filenameBurstDigitCount");
        }
        if ((kquVar.f36955t & 2) == 0) {
            sb.append(" filenameBurstTagRequired");
        }
        if ((kquVar.f36955t & 4) == 0) {
            sb.append(" filenameBurstUseGroupTag");
        }
        if (kquVar.f36945j == null) {
            sb.append(" filenameBurstSequenceExtensionsSortedLast");
        }
        if (kquVar.f36946k == null) {
            sb.append(rgoX.BjmddSoNCNq);
        }
        if (kquVar.f36948m == null) {
            sb.append(" storageContext");
        }
        if (kquVar.f36949n == null) {
            sb.append(" storageCacheSubpath");
        }
        if (kquVar.f36950o == null) {
            sb.append(" storageDataSubpath");
        }
        if (kquVar.f36951p == null) {
            sb.append(" storageDcimSubpath");
        }
        if (kquVar.f36952q == null) {
            sb.append(" defaultContentResolverApi");
        }
        if ((kquVar.f36955t & 8) == 0) {
            sb.append(" notifyChangeOnPublish");
        }
        if ((kquVar.f36955t & 16) == 0) {
            sb.append(" notifyChangeTimeoutMs");
        }
        if ((kquVar.f36955t & 32) == 0) {
            sb.append(" storageAutoPublishTimeoutMs");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
