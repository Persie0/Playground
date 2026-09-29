package p000;

import androidx.compose.p002ui.focus.FocusStateImpl;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.domain.model.status.TokenStatus;
import com.lingq.core.p012ui.library.LessonContextMenuItem;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants$PlayerState;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ix0 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f44722a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f44723b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ t66 f44724c;

    public /* synthetic */ ix0(vi3 vi3Var, t66 t66Var, int i) {
        this.f44722a = i;
        this.f44723b = vi3Var;
        this.f44724c = t66Var;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f44722a;
        tg6 tg6Var = tg6.f62255a;
        xfa xfaVar = xfa.f68157a;
        t66 t66Var = this.f44724c;
        vi3 vi3Var = this.f44723b;
        switch (i) {
            case 0:
                xy9 xy9Var = (xy9) obj;
                xy9Var.getClass();
                if (xy9Var instanceof gy9) {
                    t66Var.setValue(Boolean.FALSE);
                } else {
                    vi3Var.invoke(xy9Var);
                }
                return xfaVar;
            case 1:
                String str = (String) obj;
                str.getClass();
                t66Var.setValue(str);
                vi3Var.invoke(str);
                return xfaVar;
            case 2:
                LessonContextMenuItem lessonContextMenuItem = (LessonContextMenuItem) obj;
                lessonContextMenuItem.getClass();
                switch (f81.f38607a[lessonContextMenuItem.ordinal()]) {
                    case 1:
                        vi3Var.invoke(new u71(true));
                        break;
                    case 2:
                        vi3Var.invoke(v71.f64958a);
                        break;
                    case 3:
                        vi3Var.invoke(z71.f71002a);
                        break;
                    case 4:
                        vi3Var.invoke(t71.f61927a);
                        break;
                    case 5:
                        vi3Var.invoke(q71.f57335a);
                        break;
                    case 6:
                    case 10:
                        break;
                    case 7:
                        vi3Var.invoke(w71.f66461a);
                        break;
                    case 8:
                        vi3Var.invoke(y71.f69399a);
                        break;
                    case 9:
                        vi3Var.invoke(r71.f58821a);
                        break;
                    default:
                        gm5.m12750e();
                        return null;
                }
                t66Var.setValue(Boolean.FALSE);
                return xfaVar;
            case 3:
                ((fj4) obj).getClass();
                if (!vk9.m23391n0((String) t66Var.getValue())) {
                    vi3Var.invoke((String) t66Var.getValue());
                }
                return xfaVar;
            case 4:
                ((fj4) obj).getClass();
                if (!vk9.m23391n0((String) t66Var.getValue())) {
                    vi3Var.invoke((String) t66Var.getValue());
                }
                return xfaVar;
            case 5:
                FocusStateImpl focusStateImpl = (FocusStateImpl) obj;
                focusStateImpl.getClass();
                if (focusStateImpl.isFocused()) {
                    t66Var.setValue(Boolean.TRUE);
                } else if (((Boolean) t66Var.getValue()).booleanValue()) {
                    t66Var.setValue(Boolean.FALSE);
                    vi3Var.invoke(p09.f55400a);
                }
                return xfaVar;
            case 6:
                vv9 vv9Var = (vv9) obj;
                vv9Var.getClass();
                t66Var.setValue(vv9Var);
                vi3Var.invoke(new j03(vv9Var.f65990a.f54604b));
                return xfaVar;
            case 7:
                Float f = (Float) obj;
                f.getClass();
                vi3Var.invoke(f);
                t66Var.setValue(Boolean.FALSE);
                return xfaVar;
            case 8:
                na4 na4Var = (na4) obj;
                na4Var.getClass();
                if (na4Var.equals(ka4.f46937a)) {
                    vi3Var.invoke(tg6Var);
                } else if (na4Var instanceof ma4) {
                    vi3Var.invoke(new lh6((String) t66Var.getValue()));
                } else {
                    if (!(na4Var instanceof la4)) {
                        gm5.m12750e();
                        return null;
                    }
                    vi3Var.invoke(new kh6((String) t66Var.getValue()));
                }
                return xfaVar;
            case 9:
                PlayerConstants$PlayerState playerConstants$PlayerState = (PlayerConstants$PlayerState) obj;
                playerConstants$PlayerState.getClass();
                int i2 = hl4.f42575a[playerConstants$PlayerState.ordinal()];
                if (i2 == 1) {
                    t66Var.setValue(Boolean.TRUE);
                    vi3Var.invoke(new ora(xa7.f67999e));
                } else if (i2 == 2) {
                    t66Var.setValue(Boolean.FALSE);
                    vi3Var.invoke(new ora(ua7.f63643e));
                }
                return xfaVar;
            case 10:
                dg6 dg6Var = (dg6) obj;
                dg6Var.getClass();
                if (dg6Var.equals(wf6.f66756a)) {
                    vi3Var.invoke(((w75) t66Var.getValue()).f66480c);
                } else {
                    if (!dg6Var.equals(of6.f54277a)) {
                        gm5.m12750e();
                        return null;
                    }
                    vi3Var.invoke(tg6Var);
                }
                return xfaVar;
            case 11:
                eg6 eg6Var = (eg6) obj;
                eg6Var.getClass();
                if (eg6Var.equals(xf6.f68151a)) {
                    vi3Var.invoke(((w7a) t66Var.getValue()).f66494c);
                } else {
                    if (!eg6Var.equals(pf6.f56062a)) {
                        gm5.m12750e();
                        return null;
                    }
                    vi3Var.invoke(tg6Var);
                }
                return xfaVar;
            case 12:
                vi3Var.invoke(new era(((Float) obj).floatValue()));
                t66Var.setValue(Boolean.FALSE);
                return xfaVar;
            case 13:
                n84 n84Var = (n84) obj;
                t66Var.setValue(new n84(n84Var.f52482a));
                vi3Var.invoke(new nr7(n84Var.f52482a));
                return xfaVar;
            case 14:
                String str2 = (String) obj;
                str2.getClass();
                t66Var.setValue(str2);
                vi3Var.invoke((String) t66Var.getValue());
                return xfaVar;
            case 15:
                ((fj4) obj).getClass();
                vi3Var.invoke(new cs8((String) t66Var.getValue()));
                return xfaVar;
            case 16:
                vv9 vv9Var2 = (vv9) obj;
                vv9Var2.getClass();
                t66Var.setValue(vv9Var2);
                vi3Var.invoke(vv9Var2.f65990a.f54604b);
                return xfaVar;
            case 17:
                Float f2 = (Float) obj;
                f2.getClass();
                vi3Var.invoke(f2);
                t66Var.setValue(Boolean.FALSE);
                return xfaVar;
            case 18:
                String str3 = (String) obj;
                str3.getClass();
                t66Var.setValue(str3);
                vi3Var.invoke(str3);
                return xfaVar;
            case 19:
                String str4 = (String) obj;
                str4.getClass();
                t66Var.setValue(str4);
                vi3Var.invoke(str4);
                return xfaVar;
            case 20:
                String str5 = (String) obj;
                str5.getClass();
                t66Var.setValue(str5);
                vi3Var.invoke(str5);
                return xfaVar;
            case 21:
                vv9 vv9Var3 = (vv9) obj;
                vv9Var3.getClass();
                t66Var.setValue(vv9Var3);
                vi3Var.invoke(new h3a(vv9Var3.f65990a.f54604b));
                return xfaVar;
            case 22:
                TokenStatus tokenStatus = (TokenStatus) obj;
                tokenStatus.getClass();
                t66Var.setValue(Boolean.FALSE);
                vi3Var.invoke(new i3a(tokenStatus));
                return xfaVar;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                String str6 = (String) obj;
                str6.getClass();
                t66Var.setValue(str6);
                vi3Var.invoke(new c24((String) t66Var.getValue()));
                return xfaVar;
            case 24:
                String str7 = (String) obj;
                str7.getClass();
                t66Var.setValue(str7);
                vi3Var.invoke(new z14((String) t66Var.getValue()));
                return xfaVar;
            case 25:
                String str8 = (String) obj;
                str8.getClass();
                t66Var.setValue(str8);
                vi3Var.invoke(new z14((String) t66Var.getValue()));
                return xfaVar;
            case 26:
                String str9 = (String) obj;
                str9.getClass();
                t66Var.setValue(str9);
                vi3Var.invoke(new z14((String) t66Var.getValue()));
                return xfaVar;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                String str10 = (String) obj;
                str10.getClass();
                t66Var.setValue(str10);
                vi3Var.invoke(new xka((String) t66Var.getValue()));
                return xfaVar;
            case 28:
                vi3Var.invoke(new era(((Float) obj).floatValue()));
                t66Var.setValue(Boolean.FALSE);
                return xfaVar;
            default:
                String str11 = (String) obj;
                str11.getClass();
                t66Var.setValue(str11);
                vi3Var.invoke((String) t66Var.getValue());
                return xfaVar;
        }
    }
}
