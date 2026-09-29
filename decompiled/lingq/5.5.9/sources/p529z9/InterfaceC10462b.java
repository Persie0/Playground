package p529z9;

import android.support.v4.media.AbstractC0140a;
import androidx.activity.result.C0204c;
import ba.C1348a;
import ca.C1758a;
import com.google.android.exoplayer2.C2416m;
import p011aa.C0052a;
import p069da.C5112a;
import p091ea.C5386a;

/* JADX INFO: renamed from: z9.b */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC10462b {

    /* JADX INFO: renamed from: a */
    public static final a f52329a = new a();

    /* JADX INFO: renamed from: z9.b$a */
    public class a implements InterfaceC10462b {
        @Override // p529z9.InterfaceC10462b
        /* JADX INFO: renamed from: a */
        public final AbstractC0140a mo19417a(C2416m c2416m) {
            String str = c2416m.f12484l;
            if (str != null) {
                str.hashCode();
                switch (str) {
                    case "application/vnd.dvb.ait":
                        return new C0052a();
                    case "application/x-icy":
                        return new C1758a();
                    case "application/id3":
                        return new C5112a(null);
                    case "application/x-emsg":
                        return new C1348a();
                    case "application/x-scte35":
                        return new C5386a();
                }
            }
            throw new IllegalArgumentException(C0204c.m852k("Attempted to create decoder for unsupported MIME type: ", str));
        }

        @Override // p529z9.InterfaceC10462b
        /* JADX INFO: renamed from: b */
        public final boolean mo19418b(C2416m c2416m) {
            String str = c2416m.f12484l;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
        }
    }

    /* JADX INFO: renamed from: a */
    AbstractC0140a mo19417a(C2416m c2416m);

    /* JADX INFO: renamed from: b */
    boolean mo19418b(C2416m c2416m);
}
