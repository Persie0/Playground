package p261m9;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.InternalFrame;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p479xa.C10134c0;

/* JADX INFO: renamed from: m9.q */
/* JADX INFO: loaded from: classes.dex */
public final class C7516q {

    /* JADX INFO: renamed from: c */
    public static final Pattern f41508c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* JADX INFO: renamed from: a */
    public int f41509a = -1;

    /* JADX INFO: renamed from: b */
    public int f41510b = -1;

    /* JADX INFO: renamed from: a */
    public final boolean m15018a(String str) {
        Matcher matcher = f41508c.matcher(str);
        if (matcher.find()) {
            try {
                String strGroup = matcher.group(1);
                int i10 = C10134c0.f51354a;
                int i11 = Integer.parseInt(strGroup, 16);
                int i12 = Integer.parseInt(matcher.group(2), 16);
                if (i11 > 0 || i12 > 0) {
                    this.f41509a = i11;
                    this.f41510b = i12;
                    return true;
                }
            } catch (NumberFormatException unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final void m15019b(Metadata metadata) {
        int i10 = 0;
        while (true) {
            Metadata.Entry[] entryArr = metadata.f12627a;
            if (i10 >= entryArr.length) {
                return;
            }
            Metadata.Entry entry = entryArr[i10];
            if (entry instanceof CommentFrame) {
                CommentFrame commentFrame = (CommentFrame) entry;
                if ("iTunSMPB".equals(commentFrame.f12685c) && m15018a(commentFrame.f12686d)) {
                    return;
                }
            } else if (entry instanceof InternalFrame) {
                InternalFrame internalFrame = (InternalFrame) entry;
                if ("com.apple.iTunes".equals(internalFrame.f12692b) && "iTunSMPB".equals(internalFrame.f12693c) && m15018a(internalFrame.f12694d)) {
                    return;
                }
            } else {
                continue;
            }
            i10++;
        }
    }
}
