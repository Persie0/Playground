package td;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.google.android.play.core.assetpacks.C3110a;
import p338qd.BinderC8548j;

/* JADX INFO: renamed from: td.z */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC9278z extends BinderC9273u implements InterfaceC9251a0 {
    public AbstractBinderC9278z() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetModuleServiceCallback");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // td.BinderC9273u
    /* JADX INFO: renamed from: h */
    public final boolean mo17617h(int i10, Parcel parcel) throws RemoteException {
        switch (i10) {
            case 2:
                int i11 = parcel.readInt();
                BinderC8548j binderC8548j = (BinderC8548j) this;
                binderC8548j.f45887b.f15893d.m17621c(binderC8548j.f45886a);
                C3110a.f15888g.m15814o("onStartDownload(%d)", Integer.valueOf(i11));
                return true;
            case 3:
                int i12 = parcel.readInt();
                BinderC8548j binderC8548j2 = (BinderC8548j) this;
                binderC8548j2.f45887b.f15893d.m17621c(binderC8548j2.f45886a);
                C3110a.f15888g.m15814o("onCancelDownload(%d)", Integer.valueOf(i12));
                return true;
            case 4:
                int i13 = parcel.readInt();
                BinderC8548j binderC8548j3 = (BinderC8548j) this;
                binderC8548j3.f45887b.f15893d.m17621c(binderC8548j3.f45886a);
                C3110a.f15888g.m15814o("onGetSession(%d)", Integer.valueOf(i13));
                return true;
            case 5:
                mo16653L0(parcel.createTypedArrayList(Bundle.CREATOR));
                return true;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                Parcelable.Creator creator = Bundle.CREATOR;
                Bundle bundle = (Bundle) C9274v.m17634a(parcel, creator);
                BinderC8548j binderC8548j4 = (BinderC8548j) this;
                binderC8548j4.f45887b.f15893d.m17621c(binderC8548j4.f45886a);
                C3110a.f15888g.m15814o("onNotifyChunkTransferred(%s, %s, %d, session=%d)", bundle.getString("module_name"), bundle.getString("slice_id"), Integer.valueOf(bundle.getInt("chunk_number")), Integer.valueOf(bundle.getInt("session_id")));
                return true;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                mo16655e((Bundle) C9274v.m17634a(parcel, Bundle.CREATOR));
                return true;
            case 8:
                Parcelable.Creator creator2 = Bundle.CREATOR;
                Bundle bundle2 = (Bundle) C9274v.m17634a(parcel, creator2);
                BinderC8548j binderC8548j5 = (BinderC8548j) this;
                binderC8548j5.f45887b.f15893d.m17621c(binderC8548j5.f45886a);
                C3110a.f15888g.m15814o("onNotifyModuleCompleted(%s, sessionId=%d)", bundle2.getString("module_name"), Integer.valueOf(bundle2.getInt("session_id")));
                return true;
            case 9:
                return false;
            case 10:
                Parcelable.Creator creator3 = Bundle.CREATOR;
                Bundle bundle3 = (Bundle) C9274v.m17634a(parcel, creator3);
                BinderC8548j binderC8548j6 = (BinderC8548j) this;
                binderC8548j6.f45887b.f15893d.m17621c(binderC8548j6.f45886a);
                C3110a.f15888g.m15814o("onNotifySessionFailed(%d)", Integer.valueOf(bundle3.getInt("session_id")));
                return true;
            case 11:
                Parcelable.Creator creator4 = Bundle.CREATOR;
                mo16654P0((Bundle) C9274v.m17634a(parcel, creator4), (Bundle) C9274v.m17634a(parcel, creator4));
                return true;
            case 12:
                Parcelable.Creator creator5 = Bundle.CREATOR;
                mo16656l((Bundle) C9274v.m17634a(parcel, creator5), (Bundle) C9274v.m17634a(parcel, creator5));
                return true;
            case 13:
                Parcelable.Creator creator6 = Bundle.CREATOR;
                BinderC8548j binderC8548j7 = (BinderC8548j) this;
                binderC8548j7.f45887b.f15893d.m17621c(binderC8548j7.f45886a);
                C3110a.f15888g.m15814o("onRequestDownloadInfo()", new Object[0]);
                return true;
            case 14:
                Parcelable.Creator creator7 = Bundle.CREATOR;
                BinderC8548j binderC8548j8 = (BinderC8548j) this;
                binderC8548j8.f45887b.f15893d.m17621c(binderC8548j8.f45886a);
                C3110a.f15888g.m15814o("onRemoveModule()", new Object[0]);
                return true;
            case 15:
                BinderC8548j binderC8548j9 = (BinderC8548j) this;
                binderC8548j9.f45887b.f15893d.m17621c(binderC8548j9.f45886a);
                C3110a.f15888g.m15814o("onCancelDownloads()", new Object[0]);
                return true;
            default:
                return false;
        }
    }
}
