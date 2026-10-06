package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.support.v7.widget.Toolbar;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.preference.Preference;
import androidx.preference.TwoStatePreference;
import androidx.wear.ambient.AmbientModeSupport;
import com.android.settingslib.widget.MainSwitchPreference;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.p014ui.eduimageview.EduImageView;
import p021j$.util.Collection$EL;

/* JADX INFO: renamed from: hu */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC0250hu implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f29557a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f29558b;

    public ViewOnClickListenerC0250hu(Toolbar toolbar, int i) {
        this.f29558b = i;
        this.f29557a = toolbar;
    }

    public ViewOnClickListenerC0250hu(Preference preference, int i) {
        this.f29558b = i;
        this.f29557a = preference;
    }

    public /* synthetic */ ViewOnClickListenerC0250hu(AmbientModeSupport.AmbientController ambientController, int i, byte[] bArr) {
        this.f29558b = i;
        this.f29557a = ambientController;
    }

    public /* synthetic */ ViewOnClickListenerC0250hu(ciq ciqVar, int i) {
        this.f29558b = i;
        this.f29557a = ciqVar;
    }

    public /* synthetic */ ViewOnClickListenerC0250hu(ckw ckwVar, int i) {
        this.f29558b = i;
        this.f29557a = ckwVar;
    }

    public /* synthetic */ ViewOnClickListenerC0250hu(MainSwitchPreference mainSwitchPreference, int i) {
        this.f29558b = i;
        this.f29557a = mainSwitchPreference;
    }

    public /* synthetic */ ViewOnClickListenerC0250hu(dav davVar, int i) {
        this.f29558b = i;
        this.f29557a = davVar;
    }

    public ViewOnClickListenerC0250hu(dgo dgoVar, int i) {
        this.f29558b = i;
        this.f29557a = dgoVar;
    }

    public /* synthetic */ ViewOnClickListenerC0250hu(dpc dpcVar, int i) {
        this.f29558b = i;
        this.f29557a = dpcVar;
    }

    public /* synthetic */ ViewOnClickListenerC0250hu(dqk dqkVar, int i) {
        this.f29558b = i;
        this.f29557a = dqkVar;
    }

    public ViewOnClickListenerC0250hu(C0153ee c0153ee, int i) {
        this.f29558b = i;
        this.f29557a = c0153ee;
    }

    public /* synthetic */ ViewOnClickListenerC0250hu(enn ennVar, int i) {
        this.f29558b = i;
        this.f29557a = ennVar;
    }

    public /* synthetic */ ViewOnClickListenerC0250hu(eva evaVar, int i) {
        this.f29558b = i;
        this.f29557a = evaVar;
    }

    public /* synthetic */ ViewOnClickListenerC0250hu(ewj ewjVar, int i) {
        this.f29558b = i;
        this.f29557a = ewjVar;
    }

    public /* synthetic */ ViewOnClickListenerC0250hu(ewp ewpVar, int i) {
        this.f29558b = i;
        this.f29557a = ewpVar;
    }

    public ViewOnClickListenerC0250hu(AbstractC0199fx abstractC0199fx, int i) {
        this.f29558b = i;
        this.f29557a = abstractC0199fx;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message message;
        Message message2;
        int i;
        int i2 = 3;
        int i3 = 2;
        Message messageObtain = null;
        switch (this.f29558b) {
            case 0:
                ((AbstractC0199fx) this.f29557a).mo8648f();
                break;
            case 1:
                C0153ee c0153ee = (C0153ee) this.f29557a;
                if (view == c0153ee.f13567j && (message2 = c0153ee.f13569l) != null) {
                    messageObtain = Message.obtain(message2);
                } else if (view != c0153ee.f13570m || (message = c0153ee.f13572o) == null) {
                    Button button = c0153ee.f13573p;
                } else {
                    messageObtain = Message.obtain(message);
                }
                if (messageObtain != null) {
                    messageObtain.sendToTarget();
                }
                C0153ee c0153ee2 = (C0153ee) this.f29557a;
                c0153ee2.f13556H.obtainMessage(1, c0153ee2.f13559b).sendToTarget();
                break;
            case 2:
                ((Toolbar) this.f29557a).m1343k();
                break;
            case 3:
                ((Preference) this.f29557a).mo1467ce(view);
                break;
            case 4:
                Object obj = this.f29557a;
                ((Preference) obj).m1505W(Boolean.valueOf(((TwoStatePreference) obj).f1626a));
                break;
            case 5:
                ((ciq) this.f29557a).mo3714d();
                break;
            case 6:
                ckw ckwVar = (ckw) this.f29557a;
                if (!ckwVar.f6052k.f13306h) {
                    boolean z = !((Boolean) ((jwf) ckwVar.f6045d).f34942d).booleanValue();
                    ckwVar.f6045d.mo3415bf(Boolean.valueOf(z));
                    ckwVar.m3869G(z, 2);
                } else {
                    ckwVar.m3877h(true, true);
                }
                break;
            case 7:
                dav davVar = (dav) this.f29557a;
                daw dawVar = davVar.f10333n;
                if (dawVar.f10351e) {
                    if (!dawVar.f10350d) {
                        npk.m17604h(view);
                        if (davVar.f10340u == null) {
                            View viewMo9114a = davVar.f10330k.mo9114a();
                            igt igtVar = new igt(davVar.f10325f.getResources().getString(C0100R.string.enable_stabilization_tooltip));
                            ilk ilkVar = ilk.PORTRAIT;
                            switch (davVar.f10332m.f6585d.ordinal()) {
                                case 1:
                                    igtVar.m11304h(viewMo9114a, 20);
                                    break;
                                case 2:
                                    igtVar.m11306j(viewMo9114a, 20);
                                    break;
                                default:
                                    igtVar.m11314r(viewMo9114a);
                                    break;
                            }
                            igtVar.mo11305i();
                            igtVar.mo11307k();
                            igtVar.mo11303g(new czx(davVar, i3), davVar.f10324e);
                            igtVar.mo11302f(new czx(davVar, i2), davVar.f10324e);
                            igtVar.f30870e = 5000;
                            igtVar.f30878m = 11;
                            igtVar.f30874i = davVar.f10322c;
                            igtVar.f30871f = false;
                            igtVar.f30872g = false;
                            igtVar.mo11308l();
                            igtVar.mo11311o();
                            davVar.f10340u = igtVar.mo11297a();
                        }
                    } else if (!davVar.f10328i.get()) {
                        npk.m17604h(view);
                        if (davVar.f10320a.mo5872c()) {
                            davVar.f10320a.mo5871b();
                        } else {
                            dbe dbeVar = (dbe) davVar.f10320a;
                            if (dbeVar.f10367b.mo6184l(dib.f11361co)) {
                                dbeVar.f10371f.m11140f();
                            } else {
                                dbeVar.f10368c.m4407c();
                            }
                            Collection$EL.stream(dbeVar.f10370e).forEach(cpf.f8553e);
                        }
                        davVar.f10329j.mo10033e(gzy.f26999K, 0);
                        davVar.f10329j.mo10033e(gzy.f27000L, true);
                    }
                    break;
                }
                break;
            case 8:
                ((AmbientModeSupport.AmbientController) this.f29557a).m1651a();
                break;
            case 9:
                ((AmbientModeSupport.AmbientController) this.f29557a).m1651a();
                break;
            case 10:
                Intent intent = new Intent();
                intent.setClassName(((dgo) this.f29557a).f10937a, "com.google.android.apps.camera.legacy.app.settings.CameraSettingsActivity");
                ((dsx) ((dgo) this.f29557a).f10944h.mo16809c()).m6697l();
                ((dgo) this.f29557a).f10938b.mo9799g(intent);
                break;
            case 11:
                lku.m15613H(((dgo) this.f29557a).f10944h.mo16813g());
                ((dgo) this.f29557a).f10940d.m6113a();
                ((dsx) ((dgo) this.f29557a).f10944h.mo16809c()).m6697l();
                break;
            case 12:
                dpc dpcVar = (dpc) this.f29557a;
                dpcVar.m6533w(true, false);
                dpcVar.mo6475k();
                dpcVar.mo6477m(false);
                break;
            case 13:
                dqk dqkVar = (dqk) this.f29557a;
                jww jwwVar = dqkVar.f12322c;
                gfc gfcVar = dqkVar.f12323d;
                gfc gfcVar2 = gfc.UNKNOWN;
                switch (gfcVar.ordinal()) {
                    case 36:
                        i = gzl.ON_LIGHT.f26939f;
                        break;
                    case 37:
                        i = gzl.ON_STRONG.f26939f;
                        break;
                    case 38:
                        i = gzl.OFF.f26939f;
                        break;
                    default:
                        Log.e("VesperBottomSheet", "Invalid beautification option");
                        i = gzl.OFF.f26939f;
                        break;
                }
                jwwVar.mo3415bf(Integer.valueOf(i));
                dqkVar.f12321b.m10708g();
                break;
            case 14:
                enn ennVar = (enn) this.f29557a;
                ennVar.m7565c();
                ennVar.f14767d.m9334b();
                break;
            case 15:
                ((enn) this.f29557a).f14767d.m9334b();
                break;
            case 16:
                eva evaVar = (eva) this.f29557a;
                eqz eqzVar = (eqz) evaVar.f20328v.mo3831be();
                if (evaVar.f20318l.mo16813g()) {
                    ((eqs) evaVar.f20318l.mo16809c()).mo7611b(eqzVar, 3);
                }
                break;
            case 17:
                Object obj2 = this.f29557a;
                ewj ewjVar = (ewj) obj2;
                if (ewjVar.f20632ae.f20645g.mo16813g()) {
                    hyq hyqVar = (hyq) ewjVar.f20632ae.f20645g.mo16809c();
                    Context context = ((ComponentCallbacksC0077bw) obj2).getContext();
                    context.getClass();
                    hyqVar.m10877a(context);
                }
                break;
            case 18:
                ewp ewpVar = (ewp) this.f29557a;
                if (((mrm) ewpVar.f20661b.f26477h).mo16813g()) {
                    ((hyq) ((mrm) ewpVar.f20661b.f26477h).mo16809c()).m10877a(ewpVar.getContext());
                }
                break;
            case 19:
                ewp ewpVar2 = (ewp) this.f29557a;
                if (((mrm) ewpVar2.f20661b.f26480k).mo16813g()) {
                    jfs jfsVar = (jfs) ((mrm) ewpVar2.f20661b.f26480k).mo16809c();
                    Context context2 = ewpVar2.getContext();
                    if (jfsVar.f33914a != null) {
                        jvd.m13538a();
                        FrameLayout frameLayout = new FrameLayout(context2);
                        View.inflate(context2, C0100R.layout.chameleon_edu_layout, frameLayout);
                        TextView textView = (TextView) frameLayout.findViewById(C0100R.id.wb_edu_information);
                        String string = context2.getString(C0100R.string.wb_education_bottom_sheet_info);
                        String string2 = context2.getString(C0100R.string.wb_education_bottom_sheet_information_settings);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                        spannableStringBuilder.append((CharSequence) " ");
                        spannableStringBuilder.append((CharSequence) string2);
                        spannableStringBuilder.setSpan(new irt(context2), spannableStringBuilder.length() - string2.length(), spannableStringBuilder.length(), 0);
                        textView.setMovementMethod(LinkMovementMethod.getInstance());
                        textView.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
                        textView.setLinkTextColor(jzn.m13799B(textView));
                        EduImageView eduImageView = (EduImageView) frameLayout.findViewById(C0100R.id.wb_edu_image);
                        eduImageView.m4362c(context2.getString(C0100R.string.wb_edu_image_url), context2.getString(C0100R.string.wb_edu_image_content_description));
                        eduImageView.m4360a();
                        ((hst) jfsVar.f33914a).m10714m(11, C0100R.string.wb_education_bottom_sheet_title, frameLayout, null);
                    }
                    break;
                }
                break;
            default:
                ewp ewpVar3 = (ewp) this.f29557a;
                if (((mrm) ewpVar3.f20661b.f26478i).mo16813g()) {
                    ((ihk) ((mrm) ewpVar3.f20661b.f26478i).mo16809c()).m11343k();
                    break;
                }
                break;
        }
    }
}
