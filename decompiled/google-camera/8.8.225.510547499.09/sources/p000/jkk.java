package p000;

import android.app.Activity;
import android.content.Intent;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class jkk extends jkp {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Intent f34245a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ WeakReference f34246b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ jkl f34247c;

    public jkk(Intent intent, WeakReference weakReference, jkl jklVar) {
        this.f34245a = intent;
        this.f34246b = weakReference;
        this.f34247c = jklVar;
    }

    @Override // p000.jkp
    /* JADX INFO: renamed from: b */
    public final void mo13324b(GoogleHelp googleHelp) {
        jil jilVar;
        ViewGroup viewGroup;
        this.f34245a.putExtra("EXTRA_START_TICK", System.nanoTime());
        Activity activity = (Activity) this.f34246b.get();
        if (activity == null) {
            this.f34247c.m4648g(jkm.f34250a);
            return;
        }
        googleHelp.f7747z = jcy.f33767b;
        TogglingData togglingData = googleHelp.f7744w;
        if (togglingData != null) {
            String string = activity.getTitle().toString();
            int identifier = activity.getResources().getIdentifier("action_bar", "id", activity.getPackageName());
            if (identifier != 0 && (viewGroup = (ViewGroup) activity.findViewById(identifier)) != null) {
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt instanceof TextView) {
                        string = ((TextView) childAt).getText().toString();
                        break;
                    }
                }
            }
            togglingData.f7752c = string;
        }
        jkl jklVar = this.f34247c;
        Intent intent = this.f34245a;
        if (intent.hasExtra("EXTRA_GOOGLE_HELP")) {
            intent.putExtra("EXTRA_GOOGLE_HELP", googleHelp);
        } else if (intent.hasExtra("EXTRA_IN_PRODUCT_HELP")) {
            Parcelable.Creator creator = jki.CREATOR;
            byte[] byteArrayExtra = intent.getByteArrayExtra("EXTRA_IN_PRODUCT_HELP");
            if (byteArrayExtra == null) {
                jilVar = null;
            } else {
                jib.m13205j(creator);
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.unmarshall(byteArrayExtra, 0, byteArrayExtra.length);
                parcelObtain.setDataPosition(0);
                jilVar = (jil) creator.createFromParcel(parcelObtain);
                parcelObtain.recycle();
            }
            jki jkiVar = (jki) jilVar;
            jkiVar.f34235a = googleHelp;
            Parcel parcelObtain2 = Parcel.obtain();
            jie.m13224b(jkiVar, parcelObtain2, 0);
            byte[] bArrMarshall = parcelObtain2.marshall();
            parcelObtain2.recycle();
            intent.putExtra("EXTRA_IN_PRODUCT_HELP", bArrMarshall);
        }
        new jmx(Looper.getMainLooper()).post(new ipe(activity, intent, 17));
        jklVar.m4649i(Status.f7601a);
    }
}
