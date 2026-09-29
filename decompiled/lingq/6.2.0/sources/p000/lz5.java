package p000;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import androidx.compose.material3.AbstractC0266w;
import androidx.compose.p002ui.semantics.AbstractC0424d;
import androidx.compose.p002ui.semantics.AbstractC0426f;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import androidx.glance.appwidget.MyPackageReplacedReceiver;
import com.lingq.core.domain.model.offer.OfferBanner;
import com.lingq.core.domain.model.playlist.Playlist;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class lz5 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f50352a;

    public /* synthetic */ lz5(jb2 jb2Var) {
        this.f50352a = 23;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0067  */
    @Override // p000.vi3
    public final Object invoke(Object obj) throws Exception {
        String str;
        int i = this.f50352a;
        Integer numValueOf = null;
        xfa xfaVar = xfa.f68157a;
        switch (i) {
            case 0:
                ((ia4) obj).getClass();
                return xfaVar;
            case 1:
                ((zu8) obj).getClass();
                return xfaVar;
            case 2:
                ((ia4) obj).getClass();
                return xfaVar;
            case 3:
                AbstractC0426f.m1867k((tv8) obj);
                return xfaVar;
            case 4:
                bh4[] bh4VarArr = AbstractC0426f.f5022a;
                ((tv8) obj).mo3709d(AbstractC0424d.f5018y, xfaVar);
                return xfaVar;
            case 5:
                return MutablePreferences.toString$lambda$0((Map.Entry) obj);
            case 6:
                br4 br4Var = (br4) obj;
                int i2 = MyPackageReplacedReceiver.f5965a;
                hr4 hr4Var = (hr4) hr4.m13437n().m23359a();
                br4Var.m23361c();
                or4.m18318s((or4) br4Var.f65532b, hr4Var);
                return xfaVar;
            case 7:
                qr1 qr1Var = (qr1) obj;
                qr1Var.getClass();
                return new z76(ci8.m4730o(qr1Var));
            case 8:
                xd6 xd6Var = (xd6) obj;
                xd6Var.getClass();
                xd6Var.f68102c = true;
                return xfaVar;
            case 9:
                Context context = (Context) obj;
                context.getClass();
                ContextWrapper contextWrapper = context instanceof ContextWrapper ? (ContextWrapper) context : null;
                if (contextWrapper != null) {
                    return contextWrapper.getBaseContext();
                }
                return null;
            case 10:
                Context context2 = (Context) obj;
                context2.getClass();
                if (context2 instanceof Activity) {
                    return (Activity) context2;
                }
                return null;
            case 11:
                r86 r86Var = (r86) obj;
                r86Var.getClass();
                if (!(r86Var instanceof u86)) {
                    return null;
                }
                u86 u86Var = (u86) r86Var;
                return u86Var.m22538m(u86Var.f63589g.f60816b);
            case 12:
                fda fdaVar = AbstractC0266w.f3635a;
                return Boolean.TRUE;
            case 13:
                xd6 xd6Var2 = (xd6) obj;
                xd6Var2.getClass();
                xd6Var2.f68101b = true;
                return xfaVar;
            case 14:
                ui3 ui3Var = ((dl6) obj).f35789a;
                if (ui3Var != null) {
                    ui3Var.mo0a();
                }
                return xfaVar;
            case 15:
                return Boolean.valueOf(((nn3) obj) instanceof C0836c6);
            case 16:
                nn3 nn3Var = (nn3) obj;
                return Boolean.valueOf((nn3Var instanceof n70) || (nn3Var instanceof C0836c6));
            case 17:
                nn3 nn3Var2 = (nn3) obj;
                return Boolean.valueOf((nn3Var2 instanceof m4b) || (nn3Var2 instanceof cs3) || (nn3Var2 instanceof dn1) || (nn3Var2 instanceof C3807ys));
            case 18:
                om6 om6Var = (om6) obj;
                om6Var.getClass();
                return Integer.valueOf(om6Var.f54579a);
            case 19:
                OfferBanner offerBanner = (OfferBanner) obj;
                offerBanner.getClass();
                return offerBanner.m8106c() + "/" + offerBanner.m8105b();
            case 20:
                ((String) obj).getClass();
                return xfaVar;
            case 21:
                m47 m47Var = (m47) obj;
                m47Var.getClass();
                StringBuilder sb = new StringBuilder("position ");
                sb.append(m47Var.f50580a);
                sb.append(": '");
                return ux5.m22992o(sb, (String) m47Var.f50581b.mo0a(), '\'');
            case 22:
                ((Boolean) obj).getClass();
                return xfaVar;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                throw g9a.m12430g(obj);
            case 24:
                bk8 bk8Var = (bk8) obj;
                bk8Var.getClass();
                ik8 ik8VarMo2873e0 = bk8Var.mo2873e0("SELECT `order` FROM PlaylistEntity ORDER BY `order` DESC LIMIT 1");
                try {
                    if (ik8VarMo2873e0.mo2876a0() && !ik8VarMo2873e0.isNull(0)) {
                        numValueOf = Integer.valueOf((int) ik8VarMo2873e0.getLong(0));
                        break;
                    }
                    return numValueOf;
                } finally {
                    ik8VarMo2873e0.close();
                }
            case 25:
                bk8 bk8Var2 = (bk8) obj;
                bk8Var2.getClass();
                ik8 ik8VarMo2873e1 = bk8Var2.mo2873e0("DELETE FROM LessonAudioDownloadEntity");
                try {
                    ik8VarMo2873e1.mo2876a0();
                    return xfaVar;
                } finally {
                    ik8VarMo2873e1.close();
                }
            case 26:
                Playlist playlist = (Playlist) obj;
                playlist.getClass();
                return Integer.valueOf(playlist.m8118c());
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                Context context3 = (Context) obj;
                List<ResolveInfo> listQueryIntentActivities = context3.getPackageManager().queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0);
                ArrayList arrayList = new ArrayList(listQueryIntentActivities.size());
                int size = listQueryIntentActivities.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ResolveInfo resolveInfo = listQueryIntentActivities.get(i3);
                    ResolveInfo resolveInfo2 = resolveInfo;
                    if (context3.getPackageName().equals(resolveInfo2.activityInfo.packageName)) {
                        arrayList.add(resolveInfo);
                    } else {
                        ActivityInfo activityInfo = resolveInfo2.activityInfo;
                        if (activityInfo.exported && ((str = activityInfo.permission) == null || context3.checkSelfPermission(str) == 0)) {
                            arrayList.add(resolveInfo);
                        }
                    }
                }
                return arrayList;
            case 28:
                ((String) obj).getClass();
                return xfaVar;
            default:
                return Boolean.FALSE;
        }
    }

    public /* synthetic */ lz5(int i) {
        this.f50352a = i;
    }
}
