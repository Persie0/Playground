package p000;

import android.R;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.wear.widget.CurvedTextView;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.io.IOException;
import java.util.EnumSet;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.Executor;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jbx {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Boolean m12856a() {
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static final jcb m12857b(Context context, String str, msi msiVar, EnumSet enumSet) {
        return new jcb(context, str, enumSet, msiVar);
    }

    /* JADX INFO: renamed from: c */
    public static jbc m12858c(Context context, GoogleSignInOptions googleSignInOptions) {
        jib.m13205j(googleSignInOptions);
        return new jbc(context, googleSignInOptions);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m12859d(Context context, String str, boolean z) {
        try {
            ActivityInfo receiverInfo = context.getPackageManager().getReceiverInfo(new ComponentName(context, str), 0);
            return receiverInfo != null && receiverInfo.enabled && (!z || receiverInfo.exported);
        } catch (PackageManager.NameNotFoundException e) {
        }
    }

    /* JADX INFO: renamed from: e */
    public static int m12860e(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0100R.attr.dialogPreferenceStyle, typedValue, true);
        return typedValue.type != 0 ? C0100R.attr.dialogPreferenceStyle : R.attr.dialogPreferenceStyle;
    }

    /* JADX INFO: renamed from: f */
    public static void m12861f(TypedArray typedArray) {
        typedArray.getResourceId(2, typedArray.getResourceId(6, 0));
    }

    /* JADX INFO: renamed from: g */
    public static int m12862g(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new TypedValue().data, new int[]{i});
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return color;
    }

    /* JADX INFO: renamed from: h */
    public static ize m12863h(View view) {
        if (view instanceof TextView) {
            return new izc((TextView) view);
        }
        if (view instanceof CurvedTextView) {
            return new izb((CurvedTextView) view);
        }
        throw new IllegalArgumentException("Parameter must be of type TextView or CurvedTextView");
    }

    /* JADX INFO: renamed from: i */
    public static float m12864i(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    /* JADX INFO: renamed from: j */
    public static int m12865j(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i3, i));
    }

    /* JADX INFO: renamed from: k */
    public static hju m12866k(String str) {
        return new hju() { // from class: hjs
            @Override // p000.hju
            /* JADX INFO: renamed from: a */
            public final kba mo10393a() {
                return new gog(2);
            }
        };
    }

    /* JADX INFO: renamed from: l */
    public static void m12867l(hjn hjnVar) {
        hjnVar.mo5713h();
    }

    /* JADX INFO: renamed from: m */
    public static final void m12868m(hjq hjqVar) {
        hjqVar.mo5710e();
    }

    /* JADX INFO: renamed from: n */
    public static hjk m12869n(Runnable runnable) {
        runnable.getClass();
        return new hjl(runnable, 0);
    }

    /* JADX INFO: renamed from: o */
    public static hjk m12870o(oju ojuVar, kbz kbzVar, String str) {
        return new dft(kbzVar, str, ojuVar, 9);
    }

    /* JADX INFO: renamed from: p */
    public static void m12871p(oju ojuVar, Executor executor) {
        executor.execute(new hea(ojuVar, executor, 13));
    }

    /* JADX INFO: renamed from: q */
    public static int m12872q(int i) {
        return i - 1;
    }

    /* JADX INFO: renamed from: r */
    public static int m12873r(int i) {
        return i - 1;
    }

    /* JADX INFO: renamed from: t */
    public static void m12875t(UUID uuid, boolean z, String str, boolean z2, bfd bfdVar) {
        try {
            bff.f3083a.m5628e("http://ns.google.com/photos/1.0/creations/", "GCreations");
            bff.f3083a.m5628e("http://ns.google.com/photos/1.0/camera/", "GCamera");
            bfdVar.mo2292c("http://ns.google.com/photos/1.0/creations/", "CameraBurstID", uuid.toString());
            bfdVar.mo2292c("http://ns.google.com/photos/1.0/camera/", "BurstID", uuid.toString());
            if (z) {
                bfdVar.mo2292c("http://ns.google.com/photos/1.0/camera/", "BurstPrimary", "1");
            }
            if (z2) {
                String[] strArr = ksd.f37110b;
                for (int i = 0; i < 2; i++) {
                    bfdVar.mo2296g("DisableAutoCreation", new bge(512), strArr[i], new bge());
                }
            }
            if (dzk.NONE.m6969d().equals(str)) {
                return;
            }
            ksh.m14804j(bfdVar, str);
        } catch (bfc e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: u */
    public static jan m12876u(int i, ihk ihkVar, izr izrVar) {
        try {
            return m12877v(izrVar.f32723b.f32729b.getResources().getXml(i), ihkVar, izrVar);
        } catch (Resources.NotFoundException e) {
            izrVar.m11940u("inflate() called with unknown resourceId", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: v */
    private static final jan m12877v(XmlResourceParser xmlResourceParser, ihk ihkVar, izr izrVar) {
        try {
            xmlResourceParser.next();
            int eventType = xmlResourceParser.getEventType();
            while (eventType != 1) {
                if (xmlResourceParser.getEventType() == 2) {
                    String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.US);
                    if (lowerCase.equals("screenname")) {
                        String attributeValue = xmlResourceParser.getAttributeValue(null, "name");
                        String strTrim = xmlResourceParser.nextText().trim();
                        if (!TextUtils.isEmpty(attributeValue)) {
                            TextUtils.isEmpty(strTrim);
                        }
                    } else if (lowerCase.equals("string")) {
                        String attributeValue2 = xmlResourceParser.getAttributeValue(null, "name");
                        String strTrim2 = xmlResourceParser.nextText().trim();
                        if (!TextUtils.isEmpty(attributeValue2) && strTrim2 != null) {
                            if ("ga_appName".equals(attributeValue2)) {
                                ((jan) ihkVar.f30966a).f33605a = strTrim2;
                            } else if ("ga_appVersion".equals(attributeValue2)) {
                                ((jan) ihkVar.f30966a).f33606b = strTrim2;
                            } else if ("ga_logLevel".equals(attributeValue2)) {
                                ((jan) ihkVar.f30966a).f33607c = strTrim2;
                            } else {
                                ((izv) ihkVar.f30967b).m11951d().m11940u("String xml configuration name not recognized", attributeValue2);
                            }
                        }
                    } else if (lowerCase.equals("bool")) {
                        String attributeValue3 = xmlResourceParser.getAttributeValue(null, "name");
                        String strTrim3 = xmlResourceParser.nextText().trim();
                        if (!TextUtils.isEmpty(attributeValue3) && !TextUtils.isEmpty(strTrim3)) {
                            try {
                                boolean z = Boolean.parseBoolean(strTrim3);
                                if ("ga_dryRun".equals(attributeValue3)) {
                                    ((jan) ihkVar.f30966a).f33609e = z ? 1 : 0;
                                } else {
                                    ((izv) ihkVar.f30967b).m11951d().m11940u("Bool xml configuration name not recognized", attributeValue3);
                                }
                            } catch (NumberFormatException e) {
                                izrVar.m11941v("Error parsing bool configuration value", strTrim3, e);
                            }
                        }
                    } else if (lowerCase.equals("integer")) {
                        String attributeValue4 = xmlResourceParser.getAttributeValue(null, "name");
                        String strTrim4 = xmlResourceParser.nextText().trim();
                        if (!TextUtils.isEmpty(attributeValue4) && !TextUtils.isEmpty(strTrim4)) {
                            try {
                                int i = Integer.parseInt(strTrim4);
                                if ("ga_dispatchPeriod".equals(attributeValue4)) {
                                    ((jan) ihkVar.f30966a).f33608d = i;
                                } else {
                                    ((izv) ihkVar.f30967b).m11951d().m11940u("Int xml configuration name not recognized", attributeValue4);
                                }
                            } catch (NumberFormatException e2) {
                                izrVar.m11941v("Error parsing int configuration value", strTrim4, e2);
                            }
                        }
                    }
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e3) {
            izrVar.m11934o("Error parsing tracker configuration file", e3);
        } catch (XmlPullParserException e4) {
            izrVar.m11934o("Error parsing tracker configuration file", e4);
        }
        return (jan) ihkVar.f30966a;
    }
}
