package p000;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.cardview.widget.CardView;
import androidx.compose.p002ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.android.billingclient.api.Purchase;
import com.facebook.FacebookException;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.card.MaterialCardView;
import com.google.common.collect.ImmutableList;
import com.google.firebase.messaging.FirebaseMessaging;
import com.kochava.core.job.job.internal.JobAction;
import com.kochava.core.job.job.internal.JobState;
import com.lingq.core.analytics.C1240a;
import com.lingq.core.analytics.data.LqAnalyticsValues$PushEnabledSource;
import com.lingq.feature.onboarding.OnboardingEndFragment;
import com.lingq.feature.onboarding.R$id;
import com.lingq.feature.onboarding.auth.login.OnboardingLoginFragment;
import com.lingq.feature.onboarding.auth.login.magiclink.CheckEmailFragment;
import com.lingq.feature.onboarding.notification.OnboardingNotificationFragment;
import com.lingq.feature.reader.old.settings.LessonReviewMenuFragment;
import com.lingq.feature.reader.old.tutorial.LessonMoveKnownFragment;
import com.lingq.feature.reader.old.vocabulary.LessonVocabularyFragment;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: oy */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3440oy implements ar5, gr6, f92, sg5, k13, js6, uc0, f68, ur9, i33, yr6, InterfaceC2991f7 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f55159a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f55160b;

    public /* synthetic */ C3440oy(Object obj, int i) {
        this.f55159a = i;
        this.f55160b = obj;
    }

    @Override // p000.uc0
    /* JADX INFO: renamed from: a */
    public long mo18569a(long j) {
        p63 p63Var = (p63) this.f55160b;
        return uma.m22813h((j * ((long) p63Var.f55636e)) / 1000000, 0L, p63Var.f55641j - 1);
    }

    @Override // p000.i33
    /* JADX INFO: renamed from: b */
    public void mo13636b(File file) {
        HashMap map;
        HashMap map2;
        t06 t06Var;
        HashMap map3;
        ArrayList<w06> arrayList = (ArrayList) this.f55160b;
        file.getClass();
        HashMap map4 = t06.f61704m;
        int i = 0;
        if (lp1.f49971a.contains(gna.class)) {
            map = null;
            break;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            int iAvailable = fileInputStream.available();
            DataInputStream dataInputStream = new DataInputStream(fileInputStream);
            byte[] bArr = new byte[iAvailable];
            dataInputStream.readFully(bArr);
            dataInputStream.close();
            if (iAvailable >= 4) {
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, 0, 4);
                byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
                int i2 = byteBufferWrap.getInt();
                int i3 = i2 + 4;
                if (iAvailable >= i3) {
                    JSONObject jSONObject = new JSONObject(new String(bArr, 4, i2, yu0.f70463a));
                    JSONArray jSONArrayNames = jSONObject.names();
                    int length = jSONArrayNames.length();
                    String[] strArr = new String[length];
                    for (int i4 = 0; i4 < length; i4++) {
                        strArr[i4] = jSONArrayNames.getString(i4);
                    }
                    int i5 = 1;
                    if (length > 1) {
                        Arrays.sort(strArr);
                    }
                    map = new HashMap();
                    int i6 = 0;
                    while (i6 < length) {
                        String str = strArr[i6];
                        if (str != null) {
                            JSONArray jSONArray = jSONObject.getJSONArray(str);
                            int length2 = jSONArray.length();
                            int[] iArr = new int[length2];
                            int i7 = i5;
                            int i8 = i7;
                            for (int i9 = i; i9 < length2; i9++) {
                                int i10 = jSONArray.getInt(i9);
                                iArr[i9] = i10;
                                i8 *= i10;
                            }
                            int i11 = i8 * 4;
                            int i12 = i3 + i11;
                            if (i12 <= iAvailable) {
                                ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArr, i3, i11);
                                byteBufferWrap2.order(ByteOrder.LITTLE_ENDIAN);
                                io5 io5Var = new io5(iArr);
                                byteBufferWrap2.asFloatBuffer().get(io5Var.f44359c, 0, i8);
                                map.put(str, io5Var);
                                i3 = i12;
                            }
                        }
                        i6++;
                        i = 0;
                        i5 = 1;
                    }
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            lp1.m16420a(gna.class, th);
        }
        map = null;
        break;
        if (map == null) {
            map2 = null;
            break;
        }
        map2 = new HashMap();
        if (lp1.f49971a.contains(t06.class)) {
            map3 = null;
        } else {
            try {
                map3 = t06.f61704m;
            } catch (Throwable th2) {
                lp1.m16420a(t06.class, th2);
                map3 = null;
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            if (map3.containsKey(entry.getKey()) && (str2 = (String) map3.get(entry.getKey())) == null) {
                map2 = null;
                break;
            }
            map2.put(str2, entry.getValue());
        }
        if (map2 == null) {
            t06Var = null;
        } else {
            try {
                t06Var = new t06(map2);
            } catch (Exception unused2) {
                t06Var = null;
            }
        }
        if (t06Var != null) {
            for (w06 w06Var : arrayList) {
                StringBuilder sb = new StringBuilder();
                sb.append(w06Var.f66172a);
                sb.append('_');
                String strM24123s = wq1.m24123s(sb, w06Var.f66175d, "_rule");
                String str3 = w06Var.f66174c;
                vg1 vg1Var = new vg1(14, w06Var, t06Var);
                File file2 = new File(gna.m12765j(), strM24123s);
                if (str3 == null || file2.exists()) {
                    vg1Var.mo13636b(file2);
                } else {
                    new j33(str3, file2, vg1Var).execute(new String[0]);
                }
            }
        }
    }

    @Override // p000.InterfaceC2991f7
    /* JADX INFO: renamed from: c */
    public void mo2125c(Object obj) {
        OnboardingNotificationFragment onboardingNotificationFragment = (OnboardingNotificationFragment) this.f55160b;
        Boolean bool = (Boolean) obj;
        bool.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("push enabled source", LqAnalyticsValues$PushEnabledSource.Onboarding.getValue());
        boolean zBooleanValue = bool.booleanValue();
        hm5 hm5Var = onboardingNotificationFragment.f27267C0;
        if (zBooleanValue) {
            if (hm5Var == null) {
                fa4.m11636J("analytics");
                throw null;
            }
            ((C1240a) hm5Var).m7025f("Push notifications enabled", bundle);
        } else {
            if (hm5Var == null) {
                fa4.m11636J("analytics");
                throw null;
            }
            ((C1240a) hm5Var).m7025f("Push notifications denied", bundle);
        }
        ud6 ud6VarM3244j = b34.m3244j(onboardingNotificationFragment);
        pu6.Companion.getClass();
        ac6.Companion.getClass();
        jfa.m14428k(ud6VarM3244j, new C2916d6(R$id.actionToOnboardingTopics), null);
    }

    @Override // p000.ur9
    /* JADX INFO: renamed from: d */
    public void mo4379d() {
        bd4 bd4Var = (bd4) this.f55160b;
        if (bd4Var.m3644o()) {
            bd4Var.m3640f(new ie4(JobAction.ResumeDelay, null, -1L), JobState.RunningDelay);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m18570e(qc0 qc0Var) {
        Purchase purchase = (Purchase) this.f55160b;
        qc0Var.getClass();
        if (qc0Var.f57553a == 0) {
            r43 r43VarM20289a = r43.m20289a();
            String strOptString = purchase.f11296c.optString("orderId");
            if (TextUtils.isEmpty(strOptString)) {
                strOptString = null;
            }
            r43VarM20289a.m20290b(new Exception("Purchase was acknowledged for " + strOptString + " " + purchase.f11296c.optLong("purchaseTime")));
        }
    }

    @Override // p000.k13
    /* JADX INFO: renamed from: f */
    public void mo12756f(boolean z) {
        String str = (String) this.f55160b;
        SecureRandom secureRandom = FacebookException.f11354a;
        if (z) {
            try {
                it2 it2Var = new it2(str);
                if (it2Var.f44527b == null || it2Var.f44528c == null) {
                    return;
                }
                thb.m22040E(it2Var.f44526a, it2Var.toString());
            } catch (Exception unused) {
            }
        }
    }

    @Override // p000.js6
    /* JADX INFO: renamed from: g */
    public void mo320g(Object obj) {
        int i = this.f55159a;
        Object obj2 = this.f55160b;
        switch (i) {
            case 15:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) obj2;
                CloudMessage cloudMessage = (CloudMessage) obj;
                if (cloudMessage != null) {
                    AbstractC3352my.m17094M(cloudMessage.f11633a);
                    firebaseMessaging.m6708e();
                }
                break;
            default:
                ((fy4) obj2).invoke(obj);
                break;
        }
    }

    @Override // p000.f68
    /* JADX INFO: renamed from: h */
    public void mo10702h(long j, k47 k47Var) {
        n5d.m17243a(j, k47Var, ((pg3) this.f55160b).f56095I);
    }

    @Override // p000.f92
    /* JADX INFO: renamed from: i */
    public List mo394i(int i, j8a j8aVar, int[] iArr) {
        d92 d92Var = (d92) this.f55160b;
        c14 c14VarM6284m = ImmutableList.m6284m();
        for (int i2 = 0; i2 < j8aVar.f45214a; i2++) {
            c14VarM6284m.m3157b(new a92(i, j8aVar, i2, d92Var, iArr[i2]));
        }
        return c14VarM6284m.m4280g();
    }

    @Override // p000.sg5
    public void invoke(Object obj) {
        int i = this.f55159a;
        Object obj2 = this.f55160b;
        switch (i) {
            case 8:
                ((ba7) obj).mo3520q((tu5) obj2);
                break;
            case 9:
                ((ba7) obj).mo3526w(((jw2) obj2).f46267N);
                break;
            case 10:
                ((ba7) obj).mo3516m((es1) obj2);
                break;
            case 11:
                ((ba7) obj).mo3520q(((ew2) obj2).f37985a.f46268O);
                break;
            case 12:
                ((ba7) obj).mo3528y((ey5) obj2);
                break;
            default:
                ((ba7) obj).mo3508a((lsa) obj2);
                break;
        }
    }

    /* JADX INFO: renamed from: j */
    public void m18571j(qc0 qc0Var, wp7 wp7Var) {
        List list = wp7Var.f67154a;
        fy4 fy4Var = (fy4) this.f55160b;
        qc0Var.getClass();
        if (qc0Var.f57553a == 0) {
            list.getClass();
            if (list.isEmpty()) {
                return;
            }
            list.getClass();
            fy4Var.invoke(list);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m18572k(qc0 qc0Var, List list) {
        pc0 pc0Var = (pc0) this.f55160b;
        qc0Var.getClass();
        list.getClass();
        if (qc0Var.f57553a == 0) {
            ((cc4) pc0Var.f55939c).m4521w(list);
        }
    }

    @Override // p000.yr6
    /* JADX INFO: renamed from: m */
    public void mo321m(Exception exc) {
        Context contextM2090R = ((OnboardingLoginFragment) this.f55160b).m2090R();
        String message = exc.getMessage();
        if (message == null) {
            message = "Google sign-in failed";
        }
        Toast.makeText(contextM2090R, message, 0).show();
    }

    @Override // p000.gr6
    /* JADX INFO: renamed from: s */
    public f6b mo1889s(View view, f6b f6bVar) {
        int i = this.f55159a;
        Object obj = this.f55160b;
        switch (i) {
            case 6:
                CheckEmailFragment checkEmailFragment = (CheckEmailFragment) obj;
                bh4[] bh4VarArr = CheckEmailFragment.f27069G0;
                view.getClass();
                l64 l64VarMo136i = f6bVar.f38536a.mo136i(519);
                l64VarMo136i.getClass();
                if (checkEmailFragment.f27073F0 == -1) {
                    checkEmailFragment.f27073F0 = l64VarMo136i.f49117b;
                }
                ConstraintLayout constraintLayout = checkEmailFragment.m9113R0().f54208f;
                constraintLayout.getClass();
                ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
                if (layoutParams == null) {
                    C3386nv.m17635v("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    return null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.bottomMargin = l64VarMo136i.f49119d;
                marginLayoutParams.topMargin = checkEmailFragment.f27073F0;
                constraintLayout.setLayoutParams(marginLayoutParams);
                return f6b.f38535b;
            case 21:
                bh4[] bh4VarArr2 = LessonMoveKnownFragment.f29562H0;
                view.getClass();
                l64 l64VarMo136i2 = f6bVar.f38536a.mo136i(519);
                l64VarMo136i2.getClass();
                MaterialCardView materialCardView = ((LessonMoveKnownFragment) obj).m9350R0().f68122c;
                ViewGroup.LayoutParams layoutParams2 = materialCardView.getLayoutParams();
                if (layoutParams2 == null) {
                    C3386nv.m17635v("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    return null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams2.bottomMargin = l64VarMo136i2.f49119d;
                marginLayoutParams2.topMargin = l64VarMo136i2.f49117b;
                materialCardView.setLayoutParams(marginLayoutParams2);
                return f6b.f38535b;
            case 22:
                LessonReviewMenuFragment lessonReviewMenuFragment = (LessonReviewMenuFragment) obj;
                bh4[] bh4VarArr3 = LessonReviewMenuFragment.f29427G0;
                view.getClass();
                l64 l64VarMo136i3 = f6bVar.f38536a.mo136i(519);
                l64VarMo136i3.getClass();
                int i2 = l64VarMo136i3.f49119d;
                int i3 = l64VarMo136i3.f49117b;
                CardView cardView = lessonReviewMenuFragment.m9344R0().f71456m;
                ViewGroup.LayoutParams layoutParams3 = cardView.getLayoutParams();
                if (layoutParams3 == null) {
                    C3386nv.m17635v("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    return null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                marginLayoutParams3.topMargin = i3;
                marginLayoutParams3.bottomMargin = i2;
                cardView.setLayoutParams(marginLayoutParams3);
                CardView cardView2 = lessonReviewMenuFragment.m9344R0().f71453j;
                ViewGroup.LayoutParams layoutParams4 = cardView2.getLayoutParams();
                if (layoutParams4 == null) {
                    C3386nv.m17635v("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    return null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
                marginLayoutParams4.topMargin = i3;
                marginLayoutParams4.bottomMargin = i2;
                cardView2.setLayoutParams(marginLayoutParams4);
                return f6b.f38535b;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                LessonVocabularyFragment lessonVocabularyFragment = (LessonVocabularyFragment) obj;
                bh4[] bh4VarArr4 = LessonVocabularyFragment.f29676G0;
                view.getClass();
                l64 l64VarMo136i4 = f6bVar.f38536a.mo136i(519);
                l64VarMo136i4.getClass();
                if (!vz1.m23653w(lessonVocabularyFragment)) {
                    ComposeView composeView = lessonVocabularyFragment.m9355R0().f69680c;
                    ViewGroup.LayoutParams layoutParams5 = composeView.getLayoutParams();
                    if (layoutParams5 == null) {
                        C3386nv.m17635v("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        return null;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams5;
                    marginLayoutParams5.bottomMargin = l64VarMo136i4.f49119d;
                    composeView.setLayoutParams(marginLayoutParams5);
                }
                MaterialToolbar materialToolbar = lessonVocabularyFragment.m9355R0().f69679b;
                materialToolbar.setPadding(materialToolbar.getPaddingLeft(), l64VarMo136i4.f49117b, materialToolbar.getPaddingRight(), materialToolbar.getPaddingBottom());
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i4 = 0; i4 < childCount; i4++) {
                    viewGroup.getChildAt(i4).dispatchApplyWindowInsets(f6bVar.m11575f());
                }
                return f6bVar;
            default:
                OnboardingEndFragment onboardingEndFragment = (OnboardingEndFragment) obj;
                bh4[] bh4VarArr5 = OnboardingEndFragment.f26907H0;
                view.getClass();
                l64 l64VarMo136i5 = f6bVar.f38536a.mo136i(519);
                l64VarMo136i5.getClass();
                AppBarLayout appBarLayout = ((ve3) onboardingEndFragment.f26909D0.getValue(onboardingEndFragment, OnboardingEndFragment.f26907H0[0])).f65270a;
                ViewGroup.LayoutParams layoutParams6 = appBarLayout.getLayoutParams();
                if (layoutParams6 == null) {
                    C3386nv.m17635v("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    return null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) layoutParams6;
                marginLayoutParams6.topMargin = l64VarMo136i5.f49117b;
                appBarLayout.setLayoutParams(marginLayoutParams6);
                return f6b.f38535b;
        }
    }
}
