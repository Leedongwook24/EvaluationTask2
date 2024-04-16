package DummyFile;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

class CreateFile {
// 修正前は動作には何の支障もありませんが、
// 既に作成ファイルが存在していても関わらず、
// それを勝手に消してから作り直すことは、
// 不具合に順ずるものと見なし、既に同名のファイルが存在する場合、
// エラーが起きるように修正しました。
	protected static boolean createDummyFile(int byteSize) {
		File file = new File("./DummyFile2");
		if (file.exists()) {
			System.out.println("Already exist, Can not make new Dummy file, Check the dummy name");
			return false;
		} else {
			System.out.println("Not exist");
			try (RandomAccessFile rFile = new RandomAccessFile(file.getPath(), "rw")) {
				rFile.setLength(byteSize);
				rFile.close();
			} catch (IOException e) {
				e.printStackTrace();
				return false; 
			}
		}

		return true;
	}
}
