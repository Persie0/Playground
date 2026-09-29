package androidx.navigation;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.session.C0166e;
import android.util.AttributeSet;
import android.util.Log;
import androidx.datastore.preferences.PreferencesProto$Value;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.sequences.SequencesKt__SequencesKt;
import mo.C7661i;
import p040c4.C1690o;
import p040c4.C1697v;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, m13365d2 = {"Landroidx/navigation/ActivityNavigator;", "Landroidx/navigation/Navigator;", "Landroidx/navigation/ActivityNavigator$a;", "a", "b", "navigation-runtime_release"}, m13366k = 1, m13367mv = {1, PreferencesProto$Value.STRING_SET_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@Navigator.InterfaceC1082b("activity")
public class ActivityNavigator extends Navigator<C1068a> {

    /* JADX INFO: renamed from: c */
    public final Context f6725c;

    /* JADX INFO: renamed from: d */
    public final Activity f6726d;

    /* JADX INFO: renamed from: androidx.navigation.ActivityNavigator$a */
    public static class C1068a extends NavDestination {

        /* JADX INFO: renamed from: k */
        public Intent f6727k;

        /* JADX INFO: renamed from: l */
        public String f6728l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1068a(Navigator<? extends C1068a> navigator) {
            super(navigator);
            C5207g.m11111f(navigator, "activityNavigator");
        }

        @Override // androidx.navigation.NavDestination
        public final boolean equals(Object obj) {
            boolean zFilterEquals;
            if (obj == null || !(obj instanceof C1068a) || !super.equals(obj)) {
                return false;
            }
            Intent intent = this.f6727k;
            if (intent != null) {
                zFilterEquals = intent.filterEquals(((C1068a) obj).f6727k);
            } else {
                zFilterEquals = ((C1068a) obj).f6727k == null;
            }
            return zFilterEquals && C5207g.m11106a(this.f6728l, ((C1068a) obj).f6728l);
        }

        @Override // androidx.navigation.NavDestination
        public final int hashCode() {
            int iHashCode = super.hashCode() * 31;
            Intent intent = this.f6727k;
            int iFilterHashCode = (iHashCode + (intent != null ? intent.filterHashCode() : 0)) * 31;
            String str = this.f6728l;
            return iFilterHashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // androidx.navigation.NavDestination
        /* JADX INFO: renamed from: p */
        public final void mo3974p(Context context, AttributeSet attributeSet) {
            C5207g.m11111f(context, "context");
            super.mo3974p(context, attributeSet);
            TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, C1697v.f9468a);
            C5207g.m11110e(typedArrayObtainAttributes, "context.resources.obtain…tyNavigator\n            )");
            String string = typedArrayObtainAttributes.getString(4);
            if (string != null) {
                String packageName = context.getPackageName();
                C5207g.m11110e(packageName, "context.packageName");
                string = C7661i.m15254T2(string, "${applicationId}", packageName);
            }
            if (this.f6727k == null) {
                this.f6727k = new Intent();
            }
            Intent intent = this.f6727k;
            C5207g.m11108c(intent);
            intent.setPackage(string);
            String string2 = typedArrayObtainAttributes.getString(0);
            if (string2 != null) {
                if (string2.charAt(0) == '.') {
                    string2 = context.getPackageName() + string2;
                }
                ComponentName componentName = new ComponentName(context, string2);
                if (this.f6727k == null) {
                    this.f6727k = new Intent();
                }
                Intent intent2 = this.f6727k;
                C5207g.m11108c(intent2);
                intent2.setComponent(componentName);
            }
            String string3 = typedArrayObtainAttributes.getString(1);
            if (this.f6727k == null) {
                this.f6727k = new Intent();
            }
            Intent intent3 = this.f6727k;
            C5207g.m11108c(intent3);
            intent3.setAction(string3);
            String string4 = typedArrayObtainAttributes.getString(2);
            if (string4 != null) {
                Uri uri = Uri.parse(string4);
                if (this.f6727k == null) {
                    this.f6727k = new Intent();
                }
                Intent intent4 = this.f6727k;
                C5207g.m11108c(intent4);
                intent4.setData(uri);
            }
            this.f6728l = typedArrayObtainAttributes.getString(3);
            typedArrayObtainAttributes.recycle();
        }

        @Override // androidx.navigation.NavDestination
        public final String toString() {
            Intent intent = this.f6727k;
            ComponentName component = intent != null ? intent.getComponent() : null;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(super.toString());
            if (component != null) {
                sb2.append(" class=");
                sb2.append(component.getClassName());
            } else {
                Intent intent2 = this.f6727k;
                String action = intent2 != null ? intent2.getAction() : null;
                if (action != null) {
                    sb2.append(" action=");
                    sb2.append(action);
                }
            }
            String string = sb2.toString();
            C5207g.m11110e(string, "sb.toString()");
            return string;
        }
    }

    /* JADX INFO: renamed from: androidx.navigation.ActivityNavigator$b */
    public static final class C1069b implements Navigator.InterfaceC1081a {
    }

    public ActivityNavigator(Context context) {
        C5207g.m11111f(context, "context");
        this.f6725c = context;
        for (Object obj : SequencesKt__SequencesKt.m14252M2(context, new InterfaceC2052l<Context, Context>() { // from class: androidx.navigation.ActivityNavigator$hostActivity$1
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final Context mo528n(Context context2) {
                Context context3 = context2;
                C5207g.m11111f(context3, "it");
                if (context3 instanceof ContextWrapper) {
                    return ((ContextWrapper) context3).getBaseContext();
                }
                return null;
            }
        })) {
            if (((Context) obj) instanceof Activity) {
                this.f6726d = (Activity) obj;
            }
        }
        obj = null;
        this.f6726d = (Activity) obj;
    }

    @Override // androidx.navigation.Navigator
    /* JADX INFO: renamed from: a */
    public final NavDestination mo3971a() {
        return new C1068a(this);
    }

    @Override // androidx.navigation.Navigator
    /* JADX INFO: renamed from: c */
    public final NavDestination mo3972c(NavDestination navDestination, Bundle bundle, C1690o c1690o, Navigator.InterfaceC1081a interfaceC1081a) {
        Intent intent;
        int intExtra;
        C1068a c1068a = (C1068a) navDestination;
        if (c1068a.f6727k == null) {
            throw new IllegalStateException(C0166e.m768o(new StringBuilder("Destination "), c1068a.f6834h, " does not have an Intent set.").toString());
        }
        Intent intent2 = new Intent(c1068a.f6727k);
        if (bundle != null) {
            intent2.putExtras(bundle);
            String str = c1068a.f6728l;
            if (!(str == null || str.length() == 0)) {
                StringBuffer stringBuffer = new StringBuffer();
                Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(str);
                while (matcher.find()) {
                    String strGroup = matcher.group(1);
                    if (!bundle.containsKey(strGroup)) {
                        throw new IllegalArgumentException("Could not find " + strGroup + " in " + bundle + " to fill data pattern " + str);
                    }
                    matcher.appendReplacement(stringBuffer, "");
                    stringBuffer.append(Uri.encode(String.valueOf(bundle.get(strGroup))));
                }
                matcher.appendTail(stringBuffer);
                intent2.setData(Uri.parse(stringBuffer.toString()));
            }
        }
        boolean z10 = interfaceC1081a instanceof C1069b;
        if (z10) {
            ((C1069b) interfaceC1081a).getClass();
            intent2.addFlags(0);
        }
        Activity activity = this.f6726d;
        if (activity == null) {
            intent2.addFlags(268435456);
        }
        if (c1690o != null && c1690o.f9425a) {
            intent2.addFlags(536870912);
        }
        if (activity != null && (intent = activity.getIntent()) != null && (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) != 0) {
            intent2.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
        }
        intent2.putExtra("android-support-navigation:ActivityNavigator:current", c1068a.f6834h);
        Context context = this.f6725c;
        Resources resources = context.getResources();
        if (c1690o != null) {
            int i10 = c1690o.f9432h;
            int i11 = c1690o.f9433i;
            if ((i10 <= 0 || !C5207g.m11106a(resources.getResourceTypeName(i10), "animator")) && (i11 <= 0 || !C5207g.m11106a(resources.getResourceTypeName(i11), "animator"))) {
                intent2.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", i10);
                intent2.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", i11);
            } else {
                Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring popEnter resource " + resources.getResourceName(i10) + " and popExit resource " + resources.getResourceName(i11) + " when launching " + c1068a);
            }
        }
        if (z10) {
            ((C1069b) interfaceC1081a).getClass();
            context.startActivity(intent2);
        } else {
            context.startActivity(intent2);
        }
        if (c1690o != null && activity != null) {
            int i12 = c1690o.f9430f;
            int i13 = c1690o.f9431g;
            if ((i12 > 0 && C5207g.m11106a(resources.getResourceTypeName(i12), "animator")) || (i13 > 0 && C5207g.m11106a(resources.getResourceTypeName(i13), "animator"))) {
                Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring enter resource " + resources.getResourceName(i12) + " and exit resource " + resources.getResourceName(i13) + "when launching " + c1068a);
            } else if (i12 >= 0 || i13 >= 0) {
                if (i12 < 0) {
                    i12 = 0;
                }
                activity.overridePendingTransition(i12, i13 >= 0 ? i13 : 0);
            }
        }
        return null;
    }

    @Override // androidx.navigation.Navigator
    /* JADX INFO: renamed from: j */
    public final boolean mo3973j() {
        Activity activity = this.f6726d;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }
}
